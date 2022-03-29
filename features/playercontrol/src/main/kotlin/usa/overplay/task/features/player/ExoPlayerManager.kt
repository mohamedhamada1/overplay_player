package usa.overplay.task.features.player

import android.content.Context
import android.os.Build
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import com.google.android.exoplayer2.DefaultRenderersFactory
import com.google.android.exoplayer2.ExoPlaybackException
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import timber.log.Timber
import javax.inject.Inject
import kotlin.math.max


class ExoPlayerManager @Inject constructor(
    private val lifeCycle: Lifecycle,
    private val context: Context,
    private val playerViewProvider: PlayerViewProvider,
    var isPlayWhenReady: Boolean, private val videoUrl: String
) : DefaultLifecycleObserver,
    Player.EventListener {

    private var startItemIndex: Int = 0
    private var playbackPosition: Long = 0

    private var player: SimpleExoPlayer? = null


    override fun onStart(owner: LifecycleOwner) {
        if (lifeCycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
                initializePlayer()
                playerViewProvider.providePlayerView().onResume()
            }
        }

    }


    override fun onResume(owner: LifecycleOwner) {
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.M) {
            initializePlayer()
            playerViewProvider.providePlayerView().onResume()
        }
    }

    override fun onPause(owner: LifecycleOwner) {
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.M) {
            playerViewProvider.providePlayerView().onPause()
            releasePlayer()
        }
    }

    override fun onStop(owner: LifecycleOwner) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            playerViewProvider.providePlayerView().onPause()
            releasePlayer()
        }

    }


    private fun initializePlayer() {
        if (player == null) {
            player =
                SimpleExoPlayer.Builder(/* context= */ context,
                    DefaultRenderersFactory(context).setExtensionRendererMode(
                        DefaultRenderersFactory.EXTENSION_RENDERER_MODE_ON
                    )
                )
                    .build().apply {
                        addListener(this@ExoPlayerManager)
                        playWhenReady = isPlayWhenReady
                        seekTo(startItemIndex, playbackPosition)
                        setMediaItem(buildMediaItem(videoUrl))
                        prepare()
                        playerViewProvider.providePlayerView().player = this
                    }
        }
    }

    private fun releasePlayer() {
        player?.let {
            playbackPosition = max(0, it.contentPosition)
            startItemIndex = it.currentWindowIndex
            it.release()
            player = null
            playerViewProvider.providePlayerView().player = null
        }

    }

    fun restart() {
        player?.seekTo(0, 0)
        player?.play()
    }

    fun pause() {
        player?.pause()
    }

    var progress = 10
    var total = 100f
    private fun seekVideo() {
        val seekPercentage = (progress / total)
        val offset = (seekPercentage.toInt() / player?.getDuration()!!) + player?.contentPosition!!
        player?.seekTo(offset)

    }

    fun seekForward() {
        progress += 10
        seekVideo()
    }

    fun seekBackward() {
        progress -= 10
        seekVideo()
    }

    var progressVolume = 10
    fun volumeUp() {
        progressVolume += 10
        changeInVolume()
    }

    fun volumeDown() {
        progressVolume -= 10
        changeInVolume()
    }

    private fun changeInVolume() {
        player?.apply {
            val seekVolume = (progressVolume / total)
            val offset = seekVolume + player?.volume!!
            volume += offset
        }
    }

    fun resume() {
        player?.seekTo(startItemIndex, playbackPosition)
        player?.play()
    }

    private fun buildMediaItem(uri: String): MediaItem = MediaItem.fromUri(uri)

    override fun onPlayerError(error: ExoPlaybackException) {
        super.onPlayerError(error)

    }

}