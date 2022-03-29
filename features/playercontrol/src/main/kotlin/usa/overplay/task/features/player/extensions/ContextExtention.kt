package usa.overplay.task.features.player.extensions

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes


fun Context.showToast(@StringRes msgRes: Int) {
    showToast(getString(msgRes))
}

fun Context.showToast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}