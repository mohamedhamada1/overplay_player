-if class uk.endclothing.task.core.remote.response.ErrorResponse
-keepnames class uk.endclothing.task.core.remote.response.ErrorResponse
-if class uk.endclothing.task.core.remote.response.ErrorResponse
-keep class uk.endclothing.task.core.remote.response.ErrorResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
