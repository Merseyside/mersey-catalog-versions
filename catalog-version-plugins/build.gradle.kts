plugins {
    `version-catalog`
    `maven-publish-config`
}

catalog {
    versionCatalog {
        from(files("$projectDir/plugins.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}
