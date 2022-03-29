package usa.overplay.task.features.player.di

import ae.adres.dari.core.di.scopes.FeatureScope
import dagger.Component
import usa.overplay.task.features.player.FragmentPlayer

@FeatureScope
@Component(
    modules = [PlayersModule::class]
)
interface PlayerComponent {
    fun inject(fragment: FragmentPlayer)
}
