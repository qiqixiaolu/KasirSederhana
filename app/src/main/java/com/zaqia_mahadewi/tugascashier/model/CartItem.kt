package com.zaqia_mahadewi.tugascashier.model

data class CartItem(
    val product: Product,
    val quantity: Int
) {
    val subtotal: Int
        get() = product.price * quantity
}