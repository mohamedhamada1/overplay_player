package plugins

import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

apply<DetektPlugin>()

configure<DetektExtension> {
    input = project.files("src/main/kotlin")
    config = files("$rootDir/.detekt/config.yml")
    reports {
        xml {
            enabled = true
            destination = project.file("build/reports/detekt/report.xml")
        }
        html {
            enabled = true
            destination = project.file("build/reports/detekt/report.html")
        }
    }
}
