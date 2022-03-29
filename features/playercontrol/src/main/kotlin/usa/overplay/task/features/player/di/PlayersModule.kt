package usa.overplay.task.features.player.di


import ae.adres.dari.core.di.scopes.FeatureScope
import dagger.Module
import dagger.Provides
import usa.overplay.task.commons.ui.extensions.viewModel
import usa.overplay.task.features.player.CustomSensorManager
import usa.overplay.task.features.player.ExoPlayerManager
import usa.overplay.task.features.player.PlayerViewModel
import usa.overplay.task.features.player.FragmentPlayer
import usa.overplay.task.features.player.LocationServiceManager

@Module
class PlayersModule(private val fragment: FragmentPlayer) {
    @FeatureScope
    @Provides
    fun provideViewModel() = fragment.viewModel {
        PlayerViewModel(
            provideExoPlayer(), provideLocationService(), provideSensorManager()
        )
    }


    @FeatureScope
    @Provides
    fun provideExoPlayer() = ExoPlayerManager(
        fragment.lifecycle,
        fragment.requireContext(),
        fragment,
        false,
        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WeAreGoingOnBullrun.mp4"
    )

    @FeatureScope
    @Provides
    fun provideLocationService() = LocationServiceManager(fragment.lifecycle, fragment, fragment)

    @FeatureScope
    @Provides
    fun provideSensorManager() = CustomSensorManager(fragment.lifecycle, fragment.requireContext())
}

