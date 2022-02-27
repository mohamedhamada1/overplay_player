package uk.endclothing.task.core.remote.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ErrorResponse(
    @field:Json(name = "statusCode") val code: Int,
    @field:Json(name = "description") val description: String?
)

@JsonClass(generateAdapter = true)
data class BaseErrorResponse(
    @field:Json(name = "result") val error: ErrorResponse?
)
