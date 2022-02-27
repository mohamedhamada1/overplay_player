import dependencies.AnnotationProcessorsDependencies
import dependencies.Dependencies
import ext.addBoolean
import ext.addString
import ext.implementation
import ext.kapt

plugins {
    id("common.android-library")
}

android {
    productFlavors.forEach {
        it.addString(
            "BASE_URL", when (Flavor.flavor(it.name)) {
                Flavor.Development -> "https://www.endclothing.com/"
                Flavor.QA -> "https://www.endclothing.com/"
                Flavor.Production -> "https://www.endclothing.com/"
            }
        )


        it.addBoolean(
            "IS_PROD",
            when (Flavor.flavor(it.name)) {
                Flavor.Development -> false
                Flavor.QA -> false
                Flavor.Production -> true
            }
        )
    }

    buildTypes.forEach {
        it.addString("APP_VERSION_NAME", BuildAndroidConfig.VERSION_NAME)
    }

    defaultConfig {

        // this is needed to use Java 8 time library
        multiDexEnabled = true
    }

    sourceSets {
        getByName("test") {
            assets.srcDirs("$projectDir/dbSchemas")
        }
    }

    // this is needed to use Java 8 time library
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(Dependencies.LIFECYCLE_LIVE_DATA)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER)
    implementation(Dependencies.MOSHI)
    implementation(Dependencies.MOSHI_ADAPTERS)
    implementation(Dependencies.OKHTTP)
    implementation(Dependencies.LOGGING)

    kapt(AnnotationProcessorsDependencies.MOSHI)

    coreLibraryDesugaring(Dependencies.DESUGAR_JDK) // this is needed to use Java 8 time library
}
