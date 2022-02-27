-if class uk.endclothing.task.core.remote.response.BaseResponse
-keepnames class uk.endclothing.task.core.remote.response.BaseResponse
-if class uk.endclothing.task.core.remote.response.BaseResponse
-keep class uk.endclothing.task.core.remote.response.BaseResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi,java.lang.reflect.Type[]);
}
