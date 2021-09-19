enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    versionCatalogs {
        create("gradlePluginsLibs") { from(files("gradle-plugins.libs.versions.toml")) }
        create("libs") { from(files("../catalog-version-full/full.versions.toml")) }
    }
}