pluginManagement {
    repositories {
        maven { url = uri("https://repo.spring.io/snapshot") }
        maven { url = uri("https://repo.spring.io/milestone") }
        gradlePluginPortal()
    }
    plugins {
        kotlin("jvm") version "2.0.20"
    }
}
rootProject.name = "nft-marketplace"

