import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.compose.internal.utils.getLocalProperty
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.composeHotReload)
    alias(libs.plugins.kotlinSerialization)
//    id("com.vanniktech.maven.publish") version "0.35.0"
}

kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        instrumentedTestVariant.sourceSetTree.set(KotlinSourceSetTree.test)
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }
    
    jvm()
    
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        outputModuleName.set("composeApp")
        browser {
            val rootDirPath = project.rootDir.path
            val projectDirPath = project.projectDir.path
            commonWebpackConfig {
                outputFileName = "composeApp.js"
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(rootDirPath)
                        add(projectDirPath)
                    }
                }
            }
        }
        binaries.executable()
    }
    
    sourceSets {
        androidMain.dependencies {
            implementation(compose.preview)
            implementation(libs.androidx.activity.compose)
        }
        commonMain.dependencies {
            implementation(project(":library"))
            implementation(compose.components.resources)
//            api(compose.runtime)
//            api(compose.foundation)
//            api(libs.material3)
//            api(compose.ui)
//            api(compose.components.resources)
//            api(compose.components.uiToolingPreview)
//            api(libs.androidx.lifecycle.viewmodelCompose)
//            api(libs.androidx.lifecycle.runtimeCompose)
//            api(libs.navigation.compose)
//            api(libs.kotlinx.serialization.json)
//            api(libs.composeIcons.feather)
//            api(libs.material.adaptive)
//            api(libs.material.navigation.suite)
//            api(libs.material.layout)
//            api(libs.material.navigation)
//            implementation(libs.ui.backhandler)
//            implementation(libs.constraintlayout.compose.multiplatform)

        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
            @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
            implementation(compose.uiTest)
        }
        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutinesSwing)
        }
    }
}

compose.desktop {
    application {
        mainClass = "com.oratakashi.design.app.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.oratakashi.design.app"
            packageVersion = "1.0.0"
        }
    }
}

compose.resources {
    generateResClass = never
}

//mavenPublishing {
////    publishToMavenCentral()
//
////    signAllPublications()
//
//    coordinates(getLocalProperty("GROUP"), getLocalProperty("POM_ARTIFACT_ID"), getLocalProperty("VERSION_NAME"))
//
//}
