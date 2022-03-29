package dependencies

import org.antlr.v4.tool.BuildDependencyGenerator

object Dependencies {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${BuildDependenciesVersions.KOTLIN}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${BuildDependenciesVersions.APPCOMPAT}"
    const val MATERIAL = "com.google.android.material:material:${BuildDependenciesVersions.MATERIAL}"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${BuildDependenciesVersions.COROUTINES}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${BuildDependenciesVersions.COROUTINES}"
    const val RECYCLE_VIEW = "androidx.recyclerview:recyclerview:${BuildDependenciesVersions.RECYCLE_VIEW}"
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${BuildDependenciesVersions.NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${BuildDependenciesVersions.NAVIGATION}"
    const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${BuildDependenciesVersions.LIFECYCLE}"
    const val LIFECYCLE_LIVE_DATA = "androidx.lifecycle:lifecycle-livedata-ktx:${BuildDependenciesVersions.LIFECYCLE}"
    const val CORE_KTX = "androidx.core:core-ktx:${BuildDependenciesVersions.CORE_KTX}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${BuildDependenciesVersions.FRAGMENT_KTX}"
    const val CONSTRAIN_LAYOUT = "androidx.constraintlayout:constraintlayout:${BuildDependenciesVersions.CONSTRAIN_LAYOUT}"
    const val DAGGER = "com.google.dagger:dagger:${BuildDependenciesVersions.DAGGER}"
    const val TIMBER = "com.jakewharton.timber:timber:${BuildDependenciesVersions.TIMBER}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${BuildDependenciesVersions.RETROFIT}"
    const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-moshi:${BuildDependenciesVersions.RETROFIT}"
    const val MOSHI = "com.squareup.moshi:moshi:${BuildDependenciesVersions.MOSHI}"
    const val MOSHI_ADAPTERS = "com.squareup.moshi:moshi-adapters:${BuildDependenciesVersions.MOSHI}"
    const val LOGGING = "com.squareup.okhttp3:logging-interceptor:${BuildDependenciesVersions.OKHTTP}"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${BuildDependenciesVersions.OKHTTP}"
    const val COIL = "io.coil-kt:coil:${BuildDependenciesVersions.COIL}"
    const val ANDROID_SDP = "com.intuit.sdp:sdp-android:${BuildDependenciesVersions.ANDROID_SDP}"
    const val MULTIDEX = "androidx.multidex:multidex:${BuildDependenciesVersions.MULTIDEX}"
    const val PERMISSION_DISPATCHER = "com.github.permissions-dispatcher:ktx:${BuildDependenciesVersions.PERMISSION_DISPATCHER}"
    const val DESUGAR_JDK = "com.android.tools:desugar_jdk_libs:${BuildDependenciesVersions.DESUGAR_JDK}"
    const val EXO_PLAYER_CORE = "com.google.android.exoplayer:exoplayer-core:${BuildDependenciesVersions.EXO_PLAYER_VERSION}"
    const val EXO_PLAYER_DASH = "com.google.android.exoplayer:exoplayer-dash:${BuildDependenciesVersions.EXO_PLAYER_VERSION}"
    const val EXO_PLAYER_UI = "com.google.android.exoplayer:exoplayer-ui:${BuildDependenciesVersions.EXO_PLAYER_VERSION}"
    const val LOCATION="com.google.android.gms:play-services-location:${BuildDependenciesVersions.LOCATION}"

}
