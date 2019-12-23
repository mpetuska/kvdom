import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.plugin.getKotlinPluginVersion

plugins {
    kotlin("multiplatform") version "1.3.60"
    id("org.jetbrains.dokka") version "0.10.0"
    id("maven-publish")
    idea
}

allprojects {
    group = "lt.petuska"
    version = "0.0.2-SNAPSHOT"

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

    kotlin {
        js {
            compilations.all {
                kotlinOptions {
                    moduleKind = "umd"
                    sourceMap = true
                    metaInfo = true
                    sourceMapEmbedSources = "always"
                }
            }
            browser {}
        }
        wasm32()
        sourceSets {
            val commonMain by getting {
                dependencies {
                    api(kotlin("stdlib-common"))
                }
            }
            val jsMain by getting {
                dependencies {
                    api(kotlin("stdlib-js"))
                }
            }
        }
    }

    publishing {
        publications.withType<MavenPublication> {
            pom {
                val repoHost = "gitlab.com"
                val repoPath = "lt.petuska/kvdom"
                val repo = "$repoHost/$repoPath"
                name.set(project.name)
                description.set("Kotlin MPP Virtual DOM available for common, js and wasm targets. Compatible with Kotlin v${getKotlinPluginVersion()}")
                url.set("https://$repo")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://$repo")
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
                    url.set("https://$repo")
                    connection.set("scm:git:https://$repo.git")
                    developerConnection.set("scm:git:git@$repoHost:$repoPath.git")
                }
            }

            tasks.create("${name}PostPublish", Exec::class) {
                val publish by tasks.getting
                group = publish.group!!
                publish.dependsOn(this)
                dependsOn("publishAllPublicationsToBintrayRepository")

                executable = "curl"
                setArgs(
                    listOf(
                        "-u", "${System.getenv("BINTRAY_USER")}:${System.getenv("BINTRAY_KEY")}",
                        "-X", "DELETE",
                        "https://api.bintray.com/packages/${System.getenv("BINTRAY_USER")}/${rootProject.name}/${project.name}/versions/$artifactId"
                    )
                )
            }
        }

        repositories {
            maven {
                name = "bintray"
                url = uri(
                    "https://api.bintray.com/maven/${System.getenv("BINTRAY_USER")}/${rootProject.name}/${project.name}/" +
                            ";publish=${if ("true".equals(project.properties["publish"] as? String?, true)) 1 else 0}" +
                            ";override=${if ("true".equals(project.properties["override"] as? String?, true)) 1 else 0}"
                )
                credentials {
                    username = System.getenv("BINTRAY_USER")
                    password = System.getenv("BINTRAY_KEY")
                }
            }
        }
    }

    tasks {
        val dokka by getting(DokkaTask::class) {
            val urlBase =
                "https://gitlab.com/lt.petuska/kvdom/tree/v${version}"
            multiplatform {
                val global by creating {
                    sourceLink {
                        url = "$urlBase/$path"
                        lineSuffix = "#L"
                    }
                }
                val common by creating {}
                val js by creating {}
                val wasm32 by creating {}
            }
        }
    }
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":kvdom-dom"))
                api(project(":kvdom-core"))
            }
        }
    }
}

tasks {
    val wrapper by getting(Wrapper::class) {
        gradleVersion = "6.0.1"
    }
}