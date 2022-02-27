package plugins

import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.jlleitschuh.gradle.ktlint.KtlintPlugin

apply<KtlintPlugin>()

configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    android.set(true)
    outputColorName.set("RED")
}
