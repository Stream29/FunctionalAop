plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlinx.benchmark)
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