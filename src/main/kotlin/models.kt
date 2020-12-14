// generic
data class ApiResult(
    val status: ResultStatus,
    val message: String? = null
)

enum class ResultStatus { SUCCESS, FAILURE }

// structure
data class Structure(
    val mode: StructureMode
)

enum class StructureMode { HOME, AWAY }