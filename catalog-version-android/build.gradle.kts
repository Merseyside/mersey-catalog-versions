plugins {
    `version-catalog`
    `maven-publish-config`
}

catalog {
    versionCatalog {
        from(files("$projectDir/android.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}
