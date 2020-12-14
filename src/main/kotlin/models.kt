data class Success(
    val status: String = "OK"
)

data class Structure(
    val mode: StructureMode
)

enum class StructureMode { HOME, AWAY }