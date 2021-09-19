plugins {
    `version-catalog`
    `maven-publish-config`
}

catalog {
    versionCatalog {
        from(files("$projectDir/full.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}
