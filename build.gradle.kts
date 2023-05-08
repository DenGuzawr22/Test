import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "io.github.denguzawr22"

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.johnrengelman.shadow)

//    signing
//    `maven-publish`
//    id("org.jetbrains.dokka") version "1.7.20"
//    id("io.github.gradle-nexus.publish-plugin") version "1.3.0"
//    id("org.jetbrains.kotlin.jvm") version "1.8.21" apply false

}

allprojects{
    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "16"
    }

    repositories {
        mavenCentral()
    }
}
