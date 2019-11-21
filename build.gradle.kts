import com.jfrog.bintray.gradle.BintrayExtension

plugins {
    kotlin("multiplatform") version "1.3.60"
    id("org.jetbrains.dokka") version "0.10.0"
    id("maven-publish")
    id("com.jfrog.bintray") version "1.8.4" apply false
    idea
}

allprojects {
    group = "lt.petuska"
    version = "1.0.2-SNAPSHOT"

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
}

subprojects {
    apply(plugin = "com.jfrog.bintray")
    kotlin {
        js {
            browser()
        }
        wasm32()
    }
    configure<BintrayExtension> {
        user = System.getenv("BINTRAY_USER")
        key = System.getenv("BINTRAY_KEY")
        publish = false
        setPublications(*project.publishing.publications.map { it.name }.toTypedArray())
        pkg(delegateClosureOf<BintrayExtension.PackageConfig> {
            repo = rootProject.name
            name = project.name
            userOrg = "mpetuska"
            vcsUrl = "https://gitlab.com/lt.petuska/kvdom"
            setLicenses("GPL-3.0")
            setLabels("kotlin", "vdom", "mpp", "js", "wasm")
            publicDownloadNumbers = true
        })
    }
}

tasks {
    val wrapper by getting(Wrapper::class) {
        gradleVersion = "5.6.2"
    }
}