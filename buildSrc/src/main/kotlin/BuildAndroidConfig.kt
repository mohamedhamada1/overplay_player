object BuildAndroidConfig {
    const val APPLICATION_ID = "uk.end.task"

    const val BUILD_TOOLS_VERSION = "30.0.3"
    const val COMPILE_SDK_VERSION = 31
    const val MIN_SDK_VERSION = 19 // because of uae pass lib
    const val TARGET_SDK_VERSION = 30

    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"

    const val SUPPORT_LIBRARY_VECTOR_DRAWABLES = true

    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    val TEST_INSTRUMENTATION_RUNNER_ARGUMENTS = mapOf(
        "leakcanary.FailTestOnLeakRunListener" to "listener"
    )
}
