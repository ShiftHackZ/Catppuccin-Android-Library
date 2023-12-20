plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    `maven-publish`
}

android {
    namespace = "com.shifthackz.catppuccin.splashscreen"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }
    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

dependencies {
    api(libs.androidx.core.splashscreen)
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                groupId = "com.shifthackz.catppuccin"
                artifactId = "splashscreen"
                version = libs.versions.catppuccin.get()

                from(components["release"])
            }
        }
    }
}
