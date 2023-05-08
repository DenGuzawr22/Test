plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.johnrengelman.shadow)

    application
}

application.mainClass.set("com.example.modul2.MyClass")

tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
    mergeServiceFiles()
    val vers: String = project.properties["version"] as String
    manifest.attributes["Main-Class"] = application.mainClass
    archiveFileName.set("${project.name}-$vers.jar")
    destinationDirectory.set(file("$buildDir/output"))
}