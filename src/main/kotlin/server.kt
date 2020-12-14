import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.jackson.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.util.*
import nest.processHomeAway
import org.slf4j.event.Level


fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        install(ContentNegotiation) {
            jackson {
                enable(SerializationFeature.INDENT_OUTPUT)
            }
        }
        install(CallLogging) {
            level = Level.INFO
        }
        routing {
            post("/users/{user}/structures/{structure}") {
                val user = call.parameters.getOrFail("user")
                val structureId = call.parameters.getOrFail("structure")
                val structure = call.receive<Structure>()
                val authorization = call.request.headers["authorization"]
                call.respond(
                    processHomeAway(
                        user = user,
                        structureId = structureId,
                        structure = structure,
                        authorization = authorization
                    )
                )
            }
        }
    }.start(wait = true)
}


