plugins {
    alias(libs.plugins.kotlin.jvm)
    id("org.jetbrains.kotlinx.benchmark") version "0.4.13"
}

repositories {
    mavenCentral()
}

benchmark {
    targets {
        register("main")
    }
}


dependencies {
    implementation(libs.kotlinx.benchmark.runtime)
    implementation(project(":library"))
}