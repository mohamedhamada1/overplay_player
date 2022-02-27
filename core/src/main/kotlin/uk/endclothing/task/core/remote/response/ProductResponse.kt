package uk.endclothing.task.core.remote.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ProductResponse(
    @field:Json(name = "id") val productId: String,
    @field:Json(name = "name") val productName: String,
    @field:Json(name = "price") val productPrice: String,
    @field:Json(name = "image") val productImg: String,
)
