plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.johnrengelman.shadow)

    application
}

application.mainClass.set("com.example.modul2.MyClass")