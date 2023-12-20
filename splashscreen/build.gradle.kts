plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
}

android {
    namespace = "com.shifthackz.catppuccin.splashscreen"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }
}

dependencies {
    api(libs.androidx.core.splashscreen)
}
