import com.android.build.gradle.internal.dsl.ProductFlavor
import org.gradle.api.NamedDomainObjectContainer

enum class Flavor(val flavorName:String) {
    Development("dev"),
    QA("qa"),
    Production("prod");

    companion object {
        fun flavor(name: String) = values().firstOrNull { it.flavorName == name }
            ?: Development
    }
}

interface BuildFlavor {
    val flavor: Flavor

    fun libraryCreate(
        objectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor

    fun appCreate(
        objectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor
}

object FlavorDevelopment : BuildFlavor {
    override val flavor = Flavor.Development

    override fun appCreate(
        objectContainer: NamedDomainObjectContainer<ProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT
    )

    override fun libraryCreate(
        objectContainer: NamedDomainObjectContainer<ProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT,
        isLibrary = true
    )
}

object FlavorQA : BuildFlavor {
    override val flavor = Flavor.QA

    override fun appCreate(
        objectContainer: NamedDomainObjectContainer<ProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT
    )

    override fun libraryCreate(
        objectContainer: NamedDomainObjectContainer<ProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT,
        isLibrary = true
    )
}

object FlavorProduction : BuildFlavor {
    override val flavor = Flavor.Production

    override fun appCreate(
        objectContainer: NamedDomainObjectContainer<ProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT,
        isProduction = true
    )

    override fun libraryCreate(
        objectContainer: NamedDomainObjectContainer<ProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT,
        isProduction = true
    )
}

private fun NamedDomainObjectContainer<ProductFlavor>.create(
    flavorName: String,
    dimensionName: String,
    isLibrary: Boolean = false,
    isProduction: Boolean = false
) = this.create(flavorName) {
    if (!isProduction) {
        if (!isLibrary) applicationIdSuffix = ".$flavorName"
        versionNameSuffix = "-$flavorName"
    }
    dimension = dimensionName
}
