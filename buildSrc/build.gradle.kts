@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
    implementation("io.github.gradle-nexus:publish-plugin:1.3.0")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.25.3")
}
