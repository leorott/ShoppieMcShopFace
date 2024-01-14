package ch.torata.ShoppieMcShopFace.Controllers

import ch.torata.ShoppieMcShopFace.Entities.CartItem
import ch.torata.ShoppieMcShopFace.Repositories.CartItemRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cartItems")
class CartItemController(private val repository: CartItemRepository) {

    @GetMapping
    fun findAll() = repository.findAll()

    @PostMapping
    fun addCartItem(@RequestBody cartItem: CartItem) = repository.save(cartItem)

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long) = repository.findById(id)

    @PutMapping("/{id}")
    fun updateCartItem(@RequestBody newCartItem: CartItem, @PathVariable id: Long) {
        repository.findById(id).map { existingCartItem ->
            val updatedCartItem: CartItem = existingCartItem
                .copy(quantity = newCartItem.quantity)
            repository.save(updatedCartItem)
        }
    }

    @DeleteMapping("/{id}")
    fun removeCartItem(@PathVariable id: Long) = repository.deleteById(id)
}