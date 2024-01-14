package ch.torata.ShoppieMcShopFace.Repositories

import ch.torata.ShoppieMcShopFace.Entities.ShoppingCart
import org.springframework.data.jpa.repository.JpaRepository

interface ShoppingCartRepository : JpaRepository<ShoppingCart, Long>