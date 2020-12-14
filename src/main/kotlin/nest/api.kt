package nest

import ApiResult
import RESOURCE_API_SEND_COMMAND_ENDPOINT
import ResultStatus
import USER_AGENT
import com.google.rpc.Status
import io.ktor.client.*
import io.ktor.client.request.*
import nestlabs.gateway.v1.V1

suspend fun sendCommand(
    resourceCommandRequest: V1.ResourceCommandRequest,
    authorization: String
): ApiResult {
    HttpClient().use { client ->
        val response = client.post<ByteArray>(RESOURCE_API_SEND_COMMAND_ENDPOINT) {
            header("Content-Type", "application/x-protobuf")
            header("X-Accept-Response-Streaming", "true")
            header("User-Agent", USER_AGENT)
            header("Authorization", authorization)
            body = resourceCommandRequest.toByteArray()
        }

        return parseResponse(response)
    }
}

private fun parseResponse(response: ByteArray): ApiResult {
    val resourceCommandResponse = V1.ResourceCommandResponse.parseFrom(response)
    val status = Status.parseFrom(resourceCommandResponse.traitOperationsList[0].toByteArray())
    return if (status.message.isNullOrEmpty()) {
        ApiResult(status = ResultStatus.SUCCESS)
    } else {
        ApiResult(status = ResultStatus.FAILURE, message = status.message)
    }
}