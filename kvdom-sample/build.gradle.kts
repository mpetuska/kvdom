plugins {
  kotlin("multiplatform")
  idea
}

kotlin {
  js(IR) {
    binaries.executable()
    browser {
      distribution {
        directory = file("$buildDir/bundle/js")
      }
    }
  }
  wasm32 {
    binaries.executable {
      entryPoint = "lt.petuska.kvdom.sample.main"
    }
  }
  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation(project(":kvdom"))
      }
    }
    all {
      languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
    }
  }
}

afterEvaluate {
  tasks {
    listOf(getByName("jsBrowserDevelopmentRun"), getByName("jsBrowserProductionRun")).forEach {
      it.group = "run"
    }
    val wasm32ProcessResources by getting(Copy::class)
    val kotlinNodeJsSetup by rootProject.tasks.getting(org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsSetupTask::class)
    fun TaskContainerScope.createWasmRun(type: String) {
      val wasmLink = getByName("link${type}ExecutableWasm32", org.jetbrains.kotlin.gradle.tasks.KotlinNativeLink::class)
      val wasmBundle = create("wasm${type}Bundle", Copy::class) {
        group = "build"
        dependsOn(wasm32ProcessResources, wasmLink)
        from(wasmLink.destinationDir)
        from(wasm32ProcessResources.destinationDir)
        destinationDir = file("$buildDir/bundle/wasm/${type.toLowerCase()}")
        inputs.files(wasmLink.destinationDir, wasm32ProcessResources.destinationDir)
        outputs.dir(destinationDir)
      }
      create("wasm${type}Run", Exec::class) {
        dependsOn(wasmBundle, kotlinNodeJsSetup)
        group = "run"

        val node = if (org.gradle.internal.os.OperatingSystem.current().isWindows) {
          kotlinNodeJsSetup.destination
            .resolve("node.exe")
        } else {
          kotlinNodeJsSetup.destination
            .resolve("bin")
            .resolve("node")
        }

        val npx = if (org.gradle.internal.os.OperatingSystem.current().isWindows) {
          kotlinNodeJsSetup.destination
            .resolve("node_modules")
            .resolve("npm")
            .resolve("bin")
        } else {
          kotlinNodeJsSetup.destination
            .resolve("lib")
            .resolve("node_modules")
            .resolve("npm")
            .resolve("bin")
        }.resolve("npx-cli.js")

        workingDir = wasmBundle.destinationDir
        commandLine(
          node,
          npx,
          "serve"
        )
        inputs.files(wasmBundle.outputs)
      }
    }
    createWasmRun("Debug")
    createWasmRun("Release")
    val assemble by getting {
      dependsOn("wasmDebugBundle", "wasmReleaseBundle")
    }
  }
}
