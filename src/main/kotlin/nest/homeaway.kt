package nest

import RESOURCE_API_SEND_COMMAND_ENDPOINT
import Structure
import StructureMode
import Success
import USER_AGENT
import com.google.protobuf.Any
import com.google.protobuf.ByteString
import io.ktor.client.*
import io.ktor.client.request.*
import nest.trait.occupancy.OccupancyOuterClass
import nestlabs.gateway.v1.V1
import weave.common.Common
import java.util.*

suspend fun processHomeAway(user: String, structureId: String, structure: Structure, authorization: String): Success {
    val newStructureMode = if (structure.mode == StructureMode.HOME) {
        OccupancyOuterClass.StructureModeTrait.StructureMode.STRUCTURE_MODE_HOME
    } else {
        OccupancyOuterClass.StructureModeTrait.StructureMode.STRUCTURE_MODE_AWAY
    }

    val resourceCommandRequest = V1.ResourceCommandRequest.newBuilder().apply {
        resourceRequest = V1.ResourceRequest.newBuilder().apply {
            resourceId = "STRUCTURE_$structureId"
            requestId = ByteString.copyFromUtf8(UUID.randomUUID().toString())
        }.build()

        addAllResourceCommands(
            listOf(
                V1.ResourceCommand.newBuilder().apply {
                    traitLabel = "structure_mode"
                    command = Any.pack(
                        OccupancyOuterClass.StructureModeTrait.StructureModeChangeRequest.newBuilder().apply {
                            structureMode = newStructureMode
                            reason =
                                OccupancyOuterClass.StructureModeTrait.StructureModeReason.STRUCTURE_MODE_REASON_EXPLICIT_INTENT
                            userId = Common.ResourceId.newBuilder().setResourceId(user).build()
                        }.build(), "type.nestlabs.com"
                    )
                }.build(),
            )
        )
    }.build()

    val status = HttpClient().use { client ->
        val response = client.post<ByteArray>(RESOURCE_API_SEND_COMMAND_ENDPOINT) {
            header("Content-Type", "application/x-protobuf")
            header("X-Accept-Response-Streaming", "true")
            header("User-Agent", USER_AGENT)
            header("Authorization", authorization)
            body = resourceCommandRequest.toByteArray()
        }

        // todo blocking
        val x = V1.ResourceCommandResponse.parseFrom(response)
        println(x)
    }

    println("status: $status")

    return Success()
}
