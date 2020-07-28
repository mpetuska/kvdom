plugins {
  kotlin("multiplatform")
  idea
}

kotlin {
  js {
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
    val wasm32Main by getting {
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
        val exeType = if (org.gradle.internal.os.OperatingSystem.current().isWindows) ".cmd" else ""
        workingDir = wasmBundle.destinationDir
        executable = "${kotlinNodeJsSetup.destination}/bin/node$exeType"
        args("${kotlinNodeJsSetup.destination}/lib/node_modules/npm/bin/npx-cli.js", "serve")
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
