plugins {
  kotlin("multiplatform") version "1.4.0-rc" apply false
  id("org.jlleitschuh.gradle.ktlint") version "9.3.0"
  `maven-publish`
  idea
}

allprojects {
  group = "lt.petuska"
  version = "0.1.0"
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
    gradleVersion = "6.6.1"
    distributionType = Wrapper.DistributionType.ALL
  }
}
