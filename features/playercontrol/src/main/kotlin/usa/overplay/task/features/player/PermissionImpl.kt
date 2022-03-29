package usa.overplay.task.features.player

import permissions.dispatcher.PermissionRequest


interface PermissionImpl {
    fun onReadExternalShowRationale(request: PermissionRequest)
    fun onReadExternalPermissionDenied()
    fun openPermissionSettings()
}