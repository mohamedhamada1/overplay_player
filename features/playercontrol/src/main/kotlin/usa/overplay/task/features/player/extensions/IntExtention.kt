package usa.overplay.task.features.player.extensions

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

private const val SECOND_MILLI = 1000L

internal fun Int.countDownSeconds(): Flow<Int> =
    (this downTo 0).asFlow()
        .onEach { delay(SECOND_MILLI) }
        .conflate()
        .transform {
            emit(it)
        }
