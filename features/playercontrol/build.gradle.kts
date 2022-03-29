import dependencies.Dependencies
import ext.implementation

plugins {
    id("common.android-dynamic-feature")
}

dependencies {
    implementation(Dependencies.EXO_PLAYER_CORE)
    implementation(Dependencies.EXO_PLAYER_DASH)
    implementation(Dependencies.LOCATION)
    implementation(Dependencies.EXO_PLAYER_UI)


}
