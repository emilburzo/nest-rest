import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    application
}

group = "com.emilburzo.nest"
version = "1.0"

repositories {
    jcenter()
    mavenCentral()
    maven { url = uri("https://dl.bintray.com/kotlin/kotlinx") }
    maven { url = uri("https://dl.bintray.com/kotlin/ktor") }
}

dependencies {
    testImplementation(kotlin("test-junit"))
    implementation("io.ktor:ktor-server-netty:1.4.0")
    implementation("io.ktor:ktor-jackson:1.4.0")
    implementation("io.ktor:ktor-client-core:1.4.0")
    implementation("io.ktor:ktor-client-cio:1.4.0")
    implementation("com.google.protobuf:protobuf-java:3.11.0")
    implementation("ch.qos.logback:logback-classic:1.2.3")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "ServerKt"
}