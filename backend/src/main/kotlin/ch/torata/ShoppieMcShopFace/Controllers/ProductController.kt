package ch.torata.ShoppieMcShopFace.Controllers

import ch.torata.ShoppieMcShopFace.Entities.Product
import ch.torata.ShoppieMcShopFace.Repositories.ProductRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductController(private val repository: ProductRepository) {

    @GetMapping
    fun findAll() = repository.findAll()

    @PostMapping
    fun addProduct(@RequestBody product: Product) = repository.save(product)

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long) = repository.findById(id)

    @PutMapping("/{id}")
    fun updateProduct(@RequestBody newProduct: Product, @PathVariable id: Long) {
        repository.findById(id).map { existingProduct ->
            val updatedProduct: Product = existingProduct
                .copy(name = newProduct.name, category = newProduct.category)
            repository.save(updatedProduct)
        }
    }

    @DeleteMapping("/{id}")
    fun removeProduct(@PathVariable id: Long) = repository.deleteById(id)
}