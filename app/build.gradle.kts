import dependencies.Dependencies
import extensions.*
import org.gradle.kotlin.dsl.implementation


plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "com.github.ferum_bot.x_messenger"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0.0"
        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        BuildTypeRelease.createOrConfig(this)
        BuildTypeDebug.createOrConfig(this)
    }

    flavorDimensions(flavor.FlavorDimensions.ENVIRONMENT)

    buildFeatures {
        viewBinding = true
    }

    productFlavors {
        flavor.EnvironmentFlavor.Master.createOrConfigForApp(this)
        flavor.EnvironmentFlavor.Dev.createOrConfigForApp(this)
        flavor.EnvironmentFlavor.Prerelease.createOrConfigForApp(this)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions.apply {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    sourceSets.forEach {
        it.java.setSrcDirs(it.java.srcDirs + "src/$it.name/kotlin")
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
        unitTests.isIncludeAndroidResources = true
    }
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}