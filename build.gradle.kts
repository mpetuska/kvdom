plugins {
    kotlin("multiplatform") version "1.3.60" apply false
    id("org.jetbrains.dokka") version "0.10.0" apply false
    id("maven-publish")
    idea
}

allprojects {
    group = "lt.petuska"
    version = "0.0.2-SNAPSHOT"
    apply(plugin = "idea")

    idea {
        module {
            isDownloadJavadoc = true
            isDownloadSources = true
        }
    }

    repositories {
        jcenter()
    }
}

tasks {
    val wrapper by getting(Wrapper::class) {
        gradleVersion = "6.0.1"
    }
}