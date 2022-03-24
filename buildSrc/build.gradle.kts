@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    `kotlin-dsl`
    alias(gradlePluginsLibs.plugins.versionChecker)
}

repositories {
    mavenLocal()
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.20-RC2")
    implementation("io.github.gradle-nexus:publish-plugin:1.1.0")
}
