data class Success(val status: String = "OK")
data class Error(val error: ErrorMessage)
data class ErrorMessage(val message: String)

data class Structure(
    val mode: StructureMode
)

enum class StructureMode { HOME, AWAY }