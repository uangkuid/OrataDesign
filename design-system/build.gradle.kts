plugins {
    kotlin("multiplatform") version "2.0.21"
    id("org.jetbrains.compose") version "1.7.3"
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.21"
    id("maven-publish")
    id("signing")
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
}

group = "com.oratakashi"
version = "1.0.0-alpha01"

kotlin {
    jvm()
    
    js(IR) {
        browser()
        binaries.library()
    }
    
    // iOS targets - will be uncommented when build environment supports them
    // iosX64()
    // iosArm64() 
    // iosSimulatorArm64()
    
    // Android target - will be uncommented when build environment supports them  
    // androidTarget {
    //     publishLibraryVariants("debug", "release")
    // }
    
    sourceSets {
        commonMain.dependencies {
            api(compose.runtime)
            api(compose.foundation)
            api(compose.ui)
            api(compose.material3)
        }
        
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
        
        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
        }
        
        jsMain.dependencies {
            // JS-specific dependencies if needed
        }
    }
}

publishing {
    publications.withType<MavenPublication> {
        pom {
            name.set("Orata Design System")
            description.set("A comprehensive Kotlin Multiplatform design system built with Compose Multiplatform")
            url.set("https://github.com/uangkuid/OrataDesign")
            
            licenses {
                license {
                    name.set("The Apache License, Version 2.0")
                    url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                }
            }
            
            developers {
                developer {
                    id.set("oratakashi")
                    name.set("Oratakashi")
                    email.set("14035261+oratakashi@users.noreply.github.com")
                }
            }
            
            scm {
                connection.set("scm:git:git://github.com/uangkuid/OrataDesign.git")
                developerConnection.set("scm:git:ssh://github.com:uangkuid/OrataDesign.git")
                url.set("https://github.com/uangkuid/OrataDesign/tree/main")
            }
        }
    }
}

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
            username.set(providers.environmentVariable("OSSRH_USERNAME").orElse(project.findProperty("ossrhUsername")?.toString()))
            password.set(providers.environmentVariable("OSSRH_PASSWORD").orElse(project.findProperty("ossrhPassword")?.toString()))
        }
    }
}

signing {
    val signingKeyId = providers.environmentVariable("SIGNING_KEY_ID").orElse(project.findProperty("signing.keyId")?.toString()).orNull
    val signingKey = providers.environmentVariable("SIGNING_KEY").orElse(project.findProperty("signing.key")?.toString()).orNull
    val signingPassword = providers.environmentVariable("SIGNING_PASSWORD").orElse(project.findProperty("signing.password")?.toString()).orNull
    
    if (signingKeyId != null && signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)
        sign(publishing.publications)
    }
}

// Ensure signing happens only when publishing
tasks.withType<Sign>().configureEach {
    onlyIf { 
        gradle.taskGraph.hasTask(":design-system:publishToSonatype") ||
        gradle.taskGraph.hasTask(":design-system:publishToMavenLocal")
    }
}