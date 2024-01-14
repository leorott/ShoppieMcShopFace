package ch.torata.ShoppieMcShopFace.Repositories

import ch.torata.ShoppieMcShopFace.Entities.CartItem
import org.springframework.data.jpa.repository.JpaRepository

interface CartItemRepository : JpaRepository<CartItem, Long>