package uk.endclothing.task.core.remote.ui.mapper

import uk.endclothing.task.core.remote.response.ProductResponse
import uk.endclothing.task.core.remote.ui.Product

fun ProductResponse.toUI() = Product(
    productId = productId,
    productName = productName,
    productPrice = productPrice,
    productImg = productImg
)