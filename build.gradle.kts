import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    kotlin("multiplatform") version "1.3.50"
    id("org.jetbrains.dokka") version "0.9.18"
    id("maven-publish")
    idea
}

allprojects {
    group = "lt.petuska"
    version = "1.0.0-SNAPSHOT"

    apply(plugin = "org.jetbrains.kotlin.multiplatform")
    apply(plugin = "org.jetbrains.dokka")
    apply(plugin = "maven-publish")
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

    tasks {
        withType<DokkaTask> {
            outputFormat = "html"
            outputDirectory = "${this@allprojects.buildDir}/dokka"

            kotlinTasks {
                listOf()
            }
            sourceRoot {
                path = "${kotlin.sourceSets.commonMain.get().kotlin.srcDirs.first()}"
                platforms = mutableListOf("common", "js", "wasm")
            }
        }
    }
}

tasks {
    val wrapper by getting(Wrapper::class) {
        gradleVersion = "5.6.2"
    }
}