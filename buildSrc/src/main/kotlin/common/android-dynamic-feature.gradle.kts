package common
/*
how to use DSL and buildSrc
https://proandroiddev.com/better-dependencies-management-using-buildsrc-kotlin-dsl-eda31cdb81bf
https://proandroiddev.com/migrate-from-groovy-to-kotlin-dsl-951266f3c072
 */
import BuildModules
import dependencies.AnnotationProcessorsDependencies
import dependencies.Dependencies
import ext.implementation
import ext.kapt

// because all `plugins` clauses are executed first by gradle plugin, we have to use static strings, which sucks
plugins {
    id("common.android-library")
    id("androidx.navigation.safeargs.kotlin")
}

dependencies {
    implementation(project(BuildModules.Commons.NAVIGATION))
    implementation(project(BuildModules.Commons.UI))

    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI)
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.LIFECYCLE_LIVE_DATA)
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.MULTIDEX)
    implementation(Dependencies.ANDROID_SDP)
    implementation(Dependencies.PERMISSION_DISPATCHER)

    kapt(AnnotationProcessorsDependencies.DATABINDING)
}
