@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    `kotlin-dsl`
}

repositories {
    mavenLocal()
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
    implementation("io.github.gradle-nexus:publish-plugin:1.1.0")
}
