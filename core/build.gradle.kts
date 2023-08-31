plugins {
    kotlin("plugin.serialization")
    kotlin("multiplatform")
    id("tz.co.asoft.library")
}

description = "A collections of interoperable functions to easy interoperabiliy with java"

kotlin {
    jvm { library() }
    if (Targeting.JS) js(IR) { library() }
//    if (Targeting.WASM) wasm { library() }
    val osxTargets = if (Targeting.OSX) osxTargets() else listOf()
//    val ndkTargets = if (Targeting.NDK) ndkTargets() else listOf()
    val linuxTargets = if (Targeting.LINUX) linuxTargets() else listOf()
//    val mingwTargets = if (Targeting.MINGW) mingwTargets() else listOf()

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(libs.koncurrent.later.core)
                api(projects.kroneckerCore)
                api(projects.kronoKotlinx)
            }
        }
    }
}