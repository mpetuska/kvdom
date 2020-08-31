import io.github.httpbuilderng.http.HttpTask
import java.io.ByteArrayOutputStream

plugins {
  kotlin("multiplatform")
  id("maven-publish")
  id("org.jetbrains.dokka")
}

val repoHost = "gitlab.com"
val repoPath = "lt.petuska/kvdom"
val repo = "$repoHost/$repoPath"
val repoUrl = "https://$repo"

allprojects {
  apply(plugin = "org.jetbrains.kotlin.multiplatform")
  apply(plugin = "maven-publish")
  apply(plugin = "io.github.http-builder-ng.http-plugin")
  apply(plugin = "org.jetbrains.dokka")

  publishing {
    publications {
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
  }

  kotlin {
    explicitApiWarning()
    js(BOTH) {
      browser()
      nodejs()
      listOf(compilations["main"], compilations["test"]).forEach {
        with(it.kotlinOptions) {
          moduleKind = "umd"
          sourceMap = true
          sourceMapEmbedSources = "always"
          metaInfo = true
        }
      }
    }
    wasm32 {}
    metadata {}

    sourceSets {
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

  tasks {
    listOf(dokkaGfm, dokkaHtml, dokkaJekyll, dokkaJavadoc).forEach {
      // it {
      //   dokkaSourceSets {
      //     create("commonMain")
      //     create("jsMain")
      //     create("wasm32Main")
      //     configureEach {
      //       val projectPath = "${sourceSetID.moduleName.replace(":", "/")}/src/${sourceSetID.sourceSetName}/kotlin"
      //
      //       reportUndocumented = true
      //       sourceLink {
      //         path = "${rootProject.rootDir}$projectPath"
      //         url =
      //           "https://gitlab.com/${rootProject.group}/${rootProject.name.removeSuffix("-root")}/-/tree/v$version$projectPath"
      //         lineSuffix = "#L"
      //       }
      //     }
      //   }
      // }
    }
  }
}

fun getCommitHash() = ByteArrayOutputStream().use { os ->
  exec {
    commandLine("git", "rev-parse", "HEAD")
    standardOutput = os
  }
  os.toString().trim()
}

tasks.create("gitLabRelease", HttpTask::class) {
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
    fun buildPackageLink(project: Project) =
      """{
                          "name": "${project.name}",
                          "url": "https://bintray.com/${System.getenv("BINTRAY_USER")}/${project.group}/${project.name}/${project.version}",
                          "link_type": "package"
                        }
      """.trimIndent()
    it.request.setBody(
      """
        {
            "name": "Release v${project.version}",
            "tag_name": "v${project.version}",
            "ref": "${getCommitHash()}",
            "assets": {
                "links": [
                    ${(setOf(project) + subprojects).joinToString(",", transform = ::buildPackageLink)}
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
        api(kotlin("stdlib-common"))
        subprojects.forEach {
          println("Adding [${it.path}] to root project")
          api(it)
        }
      }
    }
    val jsMain by getting {
      dependencies {
        api(kotlin("stdlib-js"))
      }
    }
  }
}
