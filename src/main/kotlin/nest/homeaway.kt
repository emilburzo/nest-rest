package nest

import ApiResult
import Structure
import StructureMode
import com.google.protobuf.Any
import com.google.protobuf.ByteString
import nest.trait.occupancy.OccupancyOuterClass
import nestlabs.gateway.v1.V1
import weave.common.Common
import java.util.*

suspend fun processHomeAway(user: String, structureId: String, structure: Structure, authorization: String): ApiResult {
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

    return sendCommand(resourceCommandRequest = resourceCommandRequest, authorization = authorization)
}

