allprojects {
    group = "io.github.stream29"
    version = "1.0-SNAPSHOT"
}

plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
}
