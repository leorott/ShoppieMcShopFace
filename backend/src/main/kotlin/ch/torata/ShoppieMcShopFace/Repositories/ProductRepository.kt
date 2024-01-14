package ch.torata.ShoppieMcShopFace.Repositories

import ch.torata.ShoppieMcShopFace.Entities.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long>