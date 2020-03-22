import org.jetbrains.kotlin.gradle.plugin.getKotlinPluginVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeLink

plugins {
  kotlin("multiplatform")
}

repositories {
  jcenter()
  mavenCentral()
  mavenLocal()
}

val webDir = file("$projectDir/src/jsMain/web")
val wasmJsinteropEnabled = project.property("kotlin.wasm.jsinterop.enabled") == "true"
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
        doLast {
          copy {
            from(webDir) {
              filesMatching("index.html") {
                expand(project.properties)
              }
            }
            into(destinationDirectory!!)
          }
        }
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
          if (wasmJsinteropEnabled) {
            implementation(fileTree("$buildDir/klib") {
              include("*.klib")
            })
          }
        }
      }
      val jsMain by getting {
        resources.srcDir(webDir)
      }
    }
  }
}

tasks {
  val jsProcessResources by getting(Copy::class) {
    from("$webDir/index.html") {
      expand(project.properties)
    }
  }
  val jsBrowserRun by getting {
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
  
  val wasmJsInterop by creating(Exec::class) {
    workingDir = projectDir
    enabled = wasmJsinteropEnabled
    
    val isWindows = System.getProperty("os.name").startsWith("Windows")
    val packageName = "kotlinx.interop.wasm.dom"
    val jsinteropKlibFile = "$buildDir/klib/$packageName.klib"
    val ext = if (isWindows) ".bat" else ""
    val konanDataDir =
      "${System.getProperty("user.home")}/.konan/kotlin-native-${if (isWindows) "windows" else "linux"}-${getKotlinPluginVersion()}"
    
    if (file(konanDataDir).exists()) {
      val jsinteropCommand = file(konanDataDir).resolve("bin").resolve("jsinterop$ext")
      
      inputs.property("jsinteropCommand", jsinteropCommand)
      inputs.property("jsinteropPackageName", packageName)
      outputs.file(jsinteropKlibFile)
      
      commandLine(
        jsinteropCommand,
        "-pkg", packageName,
        "-o", jsinteropKlibFile,
        "-target", "wasm32"
      )
    } else {
      doFirst {
        println(konanDataDir)
        // Abort build execution if the distribution path isn't specified.
        throw GradleException(
          """
                    |
                    |Kotlin/Native distribution path must be specified to build the JavaScript interop.
                    |Use 'kotlin.native.home' project property to specify it.
                """.trimMargin()
        )
      }
    }
  }
  withType<KotlinNativeCompile> {
    dependsOn(wasmJsInterop)
  }
}