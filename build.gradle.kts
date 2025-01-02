plugins {
    kotlin("multiplatform") version "2.0.21"
    id("me.champeau.jmh") version "0.7.2"
}

group = "io.github.stream29"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation("org.openjdk.jmh:jmh-core:1.37")
            }
        }
    }
}