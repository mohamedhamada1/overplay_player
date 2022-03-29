package usa.overplay.task.commons.ui.extensions

import android.app.Activity
import android.content.Intent


fun Activity.restart() {
    val className = this::class.qualifiedName ?: return
    startActivity(Intent().setClassName(packageName, className))
    finish()
}
