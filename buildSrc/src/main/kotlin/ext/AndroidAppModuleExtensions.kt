package ext

import com.android.build.gradle.AppExtension
import com.android.build.gradle.internal.dsl.DefaultConfig
import org.gradle.api.JavaVersion
import org.gradle.api.Project


fun AppExtension.applyCommonConfigs(rootProject: Project) {
    compileSdkVersion(BuildAndroidConfig.COMPILE_SDK_VERSION)

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
        getByName("test") {
            java.srcDir("src/test/kotlin")
        }
        getByName("androidTest") {
            java.srcDir("src/androidTest/kotlin")
        }
    }

    lintOptions {
        isCheckAllWarnings = true
        isWarningsAsErrors = true
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }
}

fun DefaultConfig.applyCommonConfigs() {
    minSdkVersion(BuildAndroidConfig.MIN_SDK_VERSION)
    targetSdkVersion(BuildAndroidConfig.TARGET_SDK_VERSION)

    vectorDrawables.useSupportLibrary = BuildAndroidConfig.SUPPORT_LIBRARY_VECTOR_DRAWABLES

    testInstrumentationRunner = BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER
    testInstrumentationRunnerArguments.putAll(BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER_ARGUMENTS)

    multiDexEnabled = true
}
