package ch.torata.ShoppieMcShopFace.Repositories

import ch.torata.ShoppieMcShopFace.Entities.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Long>{
    fun findByStockGreaterThan(stock: Int): List<Product>
    fun findByCategory(category: String): List<Product>
    fun findByNameAndCategory(name: String, category: String): List<Product>
}
