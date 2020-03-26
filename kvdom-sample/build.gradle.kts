import org.jetbrains.kotlin.gradle.plugin.getKotlinPluginVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeLink

plugins {
  kotlin("multiplatform")
}

kotlin {
  wasm32 {
    binaries {
      executable {
        entryPoint = "lt.petuska.kvdom.sample.main"
      }
    }
  }
  js {
    compilations.all {
      kotlinOptions {
        moduleKind = "umd"
        sourceMap = true
        metaInfo = true
        sourceMapEmbedSources = "always"
      }
    }
    val jsProcessResources by tasks.getting(Copy::class)
    browser {
      runTask {
        devServer = devServer?.copy(
          inline = false,
          lazy = false,
          noInfo = true,
          open = false,
          overlay = true,
          port = 3000
        )
      }
      webpackTask {
        destinationDirectory = file("$buildDir/bundle/js")
      }
    }
    
    sourceSets {
      val commonMain by getting {
        dependencies {
          implementation(project(":kvdom"))
        }
      }
      val wasm32Main by getting {
        dependencies {
        }
      }
      val jsMain by getting {
        dependencies {
        
        }
      }
    }
  }
}

tasks {
  val jsProcessResources by getting(Copy::class) {
      expand(project.properties)
  }
  val jsBrowserDevelopmentRun by getting {
    group = "run"
    doFirst {
      println("Starting webpack-devServer")
      println("Available on: http://localhost:3000")
    }
  }
  val wasm32ProcessResources by getting(Copy::class)
  val linkReleaseExecutableWasm32 by getting(KotlinNativeLink::class)
  val wasmBundle by creating(Copy::class) {
    group = "build"
    dependsOn(wasm32ProcessResources, linkReleaseExecutableWasm32)
    from(linkReleaseExecutableWasm32.destinationDir)
    from(wasm32ProcessResources.destinationDir)
    destinationDir = file("$buildDir/bundle/wasm")
  }
//    val kotlinNodeJsSetup by getting(NodeJsSetupTask::class)
//    val wasmRun by creating(Exec::class) {
//        dependsOn(wasmBundle, kotlinNodeJsSetup)
//        group = "run"
//        println(kotlinNodeJsSetup.destination)
//        executable = "${kotlinNodeJsSetup.destination}/bin/node"
//        workingDir = wasmBundle.destinationDir
//        commandLine("http-server", "${wasmBundle.destinationDir}", "-c-1")
//    }
  val assemble by getting {
    dependsOn(wasmBundle)
  }
}