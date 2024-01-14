package ch.torata.ShoppieMcShopFace.Services

import ch.torata.ShoppieMcShopFace.Entities.ShoppingCart
import ch.torata.ShoppieMcShopFace.Repositories.ShoppingCartRepository
import org.springframework.stereotype.Service

@Service
class ShoppingCartService(private val repository: ShoppingCartRepository) {

    fun getAllCarts(): List<ShoppingCart> = repository.findAll()

    fun getCartById(id: Long): ShoppingCart = repository.findById(id).orElseThrow()

    fun createCart(cart: ShoppingCart): ShoppingCart = repository.save(cart)

    fun updateCart(id: Long, newCart: ShoppingCart): ShoppingCart {
        return repository.findById(id).map { existingCart ->
            existingCart.customer = newCart.customer
            existingCart.cartItems = newCart.cartItems
            repository.save(existingCart)
        }.orElseThrow()
    }

    fun deleteCart(id: Long) = repository.deleteById(id)
}