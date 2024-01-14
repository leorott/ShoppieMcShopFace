package ch.torata.ShoppieMcShopFace.Controllers

import ch.torata.ShoppieMcShopFace.Entities.ShoppingCart
import ch.torata.ShoppieMcShopFace.Repositories.ShoppingCartRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carts")
class ShoppingCartController(private val repository: ShoppingCartRepository) {

    @GetMapping
    fun findAll() = repository.findAll()

    @PostMapping
    fun addCart(@RequestBody cart: ShoppingCart) = repository.save(cart)

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long) = repository.findById(id)

    @DeleteMapping("/{id}")
    fun removeCart(@PathVariable id: Long) = repository.deleteById(id)
}