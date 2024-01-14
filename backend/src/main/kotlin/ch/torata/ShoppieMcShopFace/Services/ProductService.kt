package ch.torata.ShoppieMcShopFace.Services

import ch.torata.ShoppieMcShopFace.Entities.Product
import ch.torata.ShoppieMcShopFace.Repositories.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(private val repository: ProductRepository) {

    fun getAllProducts(): List<Product> = repository.findAll()

    fun getProductById(id: Long): Product = repository.findById(id).orElseThrow()

    fun createProduct(product: Product): Product = repository.save(product)

    fun updateProduct(id: Long, newProduct: Product): Product {
        return repository.findById(id).map { existingProduct ->
            existingProduct.name = newProduct.name
            existingProduct.price = newProduct.price
            existingProduct.description = newProduct.description
            existingProduct.picture = newProduct.picture
            existingProduct.category = newProduct.category
            existingProduct.stock = newProduct.stock

            repository.save(existingProduct)
        }.orElseThrow()
    }

    fun deleteProduct(id: Long) = repository.deleteById(id)
}