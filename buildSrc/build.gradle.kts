@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20-RC2")
    implementation("io.github.gradle-nexus:publish-plugin:1.1.0")
}
