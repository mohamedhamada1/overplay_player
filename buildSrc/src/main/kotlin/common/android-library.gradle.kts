package common

import BuildAndroidConfig
import BuildDimensions
import BuildModules
import FlavorDevelopment
import FlavorProduction
import FlavorQA
import dependencies.AnnotationProcessorsDependencies
import dependencies.Dependencies
import ext.addTestsDependencies
import ext.implementation
import ext.kapt

// because all `plugins` clauses are executed first by gradle plugin, we have to use static strings, which sucks
plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("kotlin-allopen")
    id("com.vanniktech.dependency.graph.generator")
}

allOpen {
    annotation("com.example.com.modular.core.annotations.OpenClass")
}

@Suppress("UnstableApiUsage")
android {
    compileSdkVersion(BuildAndroidConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(BuildAndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(BuildAndroidConfig.TARGET_SDK_VERSION)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    flavorDimensions(BuildDimensions.ENVIRONMENT)
    productFlavors {
        FlavorDevelopment.libraryCreate(this)
        FlavorQA.libraryCreate(this)
        FlavorProduction.libraryCreate(this)
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
        getByName("test") {
            java.srcDir("src/test/kotlin")
        }
    }

    lintOptions {
        isCheckAllWarnings = true
        isWarningsAsErrors = true
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }
}

dependencies {
    implementation(Dependencies.KOTLIN)
    implementation(Dependencies.COROUTINES)
    implementation(Dependencies.COROUTINES_ANDROID)
    implementation(Dependencies.DAGGER)
    implementation(Dependencies.TIMBER)

    kapt(AnnotationProcessorsDependencies.DAGGER)
    addTestsDependencies()
}
