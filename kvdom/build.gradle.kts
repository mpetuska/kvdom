import Build_gradle.*
import io.github.httpbuilderng.http.*
import org.jetbrains.kotlin.gradle.plugin.*
import java.io.*


plugins {
  kotlin("multiplatform")
  id("maven-publish")
  id("org.jetbrains.dokka")
  id("io.github.http-builder-ng.http-plugin")
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
  
  
  fun MavenPublication.config(config: MavenPomFile.() -> Unit = {}) {
    pom {
      name by project.name
      description by "Kotlin MPP Virtual DOM available for common, js and wasm targets. Compatible with Kotlin v${getKotlinPluginVersion()}"
      url by repoUrl
      licenses {
        license {
          name by "The Apache License, Version 2.0"
          url by "http://www.apache.org/licenses/LICENSE-2.0.txt"
          distribution by "repo"
        }
      }
      developers {
        developer {
          id by "mpetuska"
          name by "Martynas Petuška"
          email by "martynas.petuska@outlook.com"
        }
      }
      scm {
        url by "https://$repo"
        connection by "scm:git:https://$repo.git"
        developerConnection by "scm:git:git@$repoHost:$repoPath.git"
      }
      config()
    }
  }
  
  fun MavenPublication.jar(taskName: String, config: Action<Jar>) = artifact(tasks.create(taskName, Jar::class, config))
  
  fun MavenPublication.javadocJar(taskName: String, config: Jar.() -> Unit = {}) = jar(taskName) {
    archiveClassifier by "javadoc"
    config()
  }
  
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
    js(BOTH) {
      browser()
      listOf(compilations["main"], compilations["test"]).forEach {
        with(it.kotlinOptions) {
          moduleKind = "umd"
          sourceMap = true
          sourceMapEmbedSources = "always"
          metaInfo = true
        }
      }
      mavenPublication {
        groupId = group as String
        artifactId = "${project.name}-js"
        config { name by "${project.name}-js" }
        
        javadocJar("jsJavadocJar")
        jar("jsTestSourcesJar") {
          archiveClassifier by "test-sources"
          with(sourceSets["jsTest"]) {
            from(kotlin, resources)
          }
        }
      }
    }
    wasm32 {
      mavenPublication {
        groupId = group as String
        artifactId = "${project.name}-wasm32"
        config { name by "${project.name}-wasm32" }
        
        javadocJar("wasm32JavadocJar")
        jar("wasm32TestSourcesJar") {
          archiveClassifier by "test-sources"
          with(sourceSets["wasm32Test"]) {
            from(kotlin, resources)
          }
        }
      }
    }
    metadata {
      mavenPublication {
        groupId = group as String
        artifactId = "${project.name}-metadata"
        config { name by "${project.name}-metadata" }
        
        javadocJar("metadataJavadocJar")
        jar("metadataTestSourcesJar") {
          archiveClassifier by "test-sources"
          with(sourceSets["commonTest"]) {
            from(kotlin, resources)
          }
        }
      }
    }
    
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
    dokkaHtml {
      dokkaSourceSets {
        create("commonMain")
        create("jsMain")
        create("wasm32Main")
        configureEach {
          val projectPath = "${sourceSetID.moduleName.replace(":", "/")}/src/${sourceSetID.sourceSetName}/kotlin"
          
          reportUndocumented = true
          sourceLink {
            path = "${rootProject.rootDir}$projectPath"
            url = "https://gitlab.com/${rootProject.group}/${rootProject.name}/tree/v$version$projectPath"
            lineSuffix = "#L"
          }
        }
      }
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
    fun buildPackageLink(project: Project) = """{
                          "name": "${project.name}",
                          "url": "https://bintray.com/${System.getenv("BINTRAY_USER")}/${project.group}/${project.name}/${project.version}",
                          "link_type": "package"
                        }""".trimIndent()
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
        subprojects.forEach {
          println("Adding [${it.path}] to root project")
          api(project(it.path))
        }
      }
    }
  }
}

typealias MavenPomFile = org.gradle.api.publish.maven.MavenPom

infix fun <T> Property<T>.by(value: T) {
  set(value)
}
