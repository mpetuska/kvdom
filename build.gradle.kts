plugins {
  kotlin("multiplatform") version "1.4.0-rc" apply false
  id("org.jetbrains.dokka") version "1.4.0-rc" apply false
  id("maven-publish")
  id("io.github.http-builder-ng.http-plugin") version "0.1.1" apply false
  val ktLintVersion = "9.3.0"
  id("org.jlleitschuh.gradle.ktlint") version ktLintVersion
  idea
}

allprojects {
  group = "lt.petuska"
  version = "0.1.0-M3"
  apply(plugin = "idea")
  apply(plugin = "org.jlleitschuh.gradle.ktlint")

  idea {
    module {
      isDownloadJavadoc = true
      isDownloadSources = true
    }
  }

  repositories {
    mavenLocal()
    jcenter()
    mavenCentral()
    maven("https://dl.bintray.com/mpetuska/lt.petuska")
    if (System.getProperty("enableKotlinDevChannel") === "true") {
      maven("https://dl.bintray.com/kotlin/kotlin-dev")
    }
  }

  tasks {
    withType<Jar> {
      manifest {
        attributes += sortedMapOf(
          "Built-By" to System.getProperty("user.name"),
          "Build-Jdk" to System.getProperty("java.version"),
          "Implementation-Version" to project.version,
          "Created-By" to org.gradle.util.GradleVersion.current()
        )
      }
    }
  }
}

tasks {
  val wrapper by getting(Wrapper::class) {
    gradleVersion = "6.5"
  }
}
