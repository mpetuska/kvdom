import io.github.httpbuilderng.http.*
import org.jetbrains.dokka.gradle.*
import org.jetbrains.kotlin.gradle.plugin.*


plugins {
  kotlin("multiplatform")
  id("org.jetbrains.dokka")
  id("maven-publish")
  id("io.github.http-builder-ng.http-plugin")
}

allprojects {
  apply(plugin = "org.jetbrains.kotlin.multiplatform")
  apply(plugin = "io.github.http-builder-ng.http-plugin")
  apply(plugin = "org.jetbrains.dokka")
  apply(plugin = "maven-publish")
  
  kotlin {
    js {
      browser()
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
      val wasm32Main by getting {
        wasm32().compilations["main"].apply {
          kotlinOptions.freeCompilerArgs = resources.files.flatMap {
            listOf("-include-binary", it.invariantSeparatorsPath)
          }
        }
      }
      all {
        languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
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
            name.set("The Apache License, Version 2.0")
            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            distribution.set("repo")
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
      
      tasks.create("${name}PostPublish", HttpTask::class) {
        val publish by tasks.getting
        group = publish.group!!
        publish.dependsOn(this)
        dependsOn("publish${this@withType.name[0].toUpperCase() + this@withType.name.substring(1)}PublicationToBintrayRepository")
        
        config {
          it.request.setUri("https://api.bintray.com")
        }
        delete {
          it.request.uri.setPath("/packages/${System.getenv("BINTRAY_USER")}/${project.group}/${project.name}/versions/$artifactId")
          it.request.auth.basic(System.getenv("BINTRAY_USER"), System.getenv("BINTRAY_KEY"))
        }
      }
    }
    
    repositories {
      maven {
        name = "bintray"
        url = uri(
          "https://api.bintray.com/maven/${System.getenv("BINTRAY_USER")}/${project.group}/${project.name}/" +
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

tasks.create("release", HttpTask::class) {
  allprojects.forEach {
    val publish by it.tasks.getting
    dependsOn(publish)
    group = publish.group!!
  }
  
  config {
    it.request.setUri("https://gitlab.com")
  }
  post {
    it.request.uri.setPath("/api/v4/projects/${System.getenv("CI_PROJECT_ID")}/releases")
    it.request.headers["Authorization"] = "Bearer ${System.getenv("PRIVATE_TOKEN")}"
    it.request.setContentType("application/json")
    it.request.setBody(
      """
        {
            "name": "Release v${project.version}",
            "tag_name": "v${project.version}",
            "ref": "master",
            "assets": {
                "links": [
                    {
                        "name": "${project.name}",
                        "url": "https://bintray.com/${System.getenv("BINTRAY_USER")}/${project.group}/${project.name}/${project.version}"
                    }
                ]
            },
            "description": "## Changelog\n### Breaking Changes\nN/A\n\n### New Features\nN/A\n\n### Fixes\nN/A"
        }
      """.trimIndent()
    )
  }
}

kotlin {
  sourceSets {
    val commonMain by getting {
      dependencies {
        subprojects.forEach {
          println("Adding [${it.name}] to root project")
          api(project(":${project.name}:${it.name}"))
        }
      }
    }
  }
}
