enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    versionCatalogs {

        val multiplatformLibs by creating {
            from(files("../catalog-version-multiplatform/multiplatform.versions.toml"))
        }

        val androidLibs by creating {
            from(files("../catalog-version-android/android.versions.toml"))
        }

        val common by creating {
            from(files("../catalog-version-common/common.versions.toml"))
        }
    }
}