package usa.overplay.task.features.player

import com.google.android.exoplayer2.ui.PlayerView

interface PlayerViewProvider {
    fun providePlayerView():PlayerView
}

