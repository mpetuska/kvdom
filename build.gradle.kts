plugins {
    kotlin("multiplatform") version "1.3.60"
    id("org.jetbrains.dokka") version "0.10.0"
    id("maven-publish")
    idea
}

allprojects {
    group = "lt.petuska"
    version = "1.0.1"

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
}

subprojects {
    kotlin {
        js {
            browser()
        }
        wasm32()
    }
    publishing {
        publications.withType<MavenPublication> {
            pom {
                name.set(this@subprojects.name)
                description.set("Kotlin MPP Virtual DOM available forcommon, js and wasm targets")
                url.set("https://gitlab.com/lt.petuska/kvdom")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://gitlab.com/lt.petuska/kvdom")
                        distribution.set("repo")
                    }
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("mpetuska")
                        name.set("Martynas Petuška")
                        email.set("martynas.petuska@gmail.com")
                    }
                }
                scm {
                    url.set("https://gitlab.com/lt.petuska/kvdom")
                    connection.set("scm:git:https://gitlab.com/lt.petuska/kvdom.git")
                    developerConnection.set("scm:git:git@gitlab.com:lt.petuska/kvdom.git")
                }
            }
        }

        repositories {
            maven("https://api.bintray.com/maven/${System.getenv("BINTRAY_USER")}/${rootProject.name}/${this@subprojects.name}/;publish=0;override=1") {
                credentials {
                    username = System.getenv("BINTRAY_USER")
                    password = System.getenv("BINTRAY_KEY")
                }
            }
        }
    }
}

tasks {
    val wrapper by getting(Wrapper::class) {
        gradleVersion = "5.6.2"
    }
}