plugins {
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.android.library)
    `maven-publish`
}

android {
    namespace = "com.shifthackz.catppuccin.compose"
    compileSdk = 34

    defaultConfig {
        minSdk = 21

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidxComposeCompiler.get()
    }
}

dependencies {
    api(project(":palette"))
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.core.ktx)
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                groupId = "com.shifthackz.catppuccin"
                artifactId = "compose"
                version = libs.versions.catppuccin.get()

                from(components["release"])
            }
        }
    }
}
