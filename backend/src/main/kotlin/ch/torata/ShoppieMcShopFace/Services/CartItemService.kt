package ch.torata.ShoppieMcShopFace.Services

import ch.torata.ShoppieMcShopFace.Entities.CartItem
import ch.torata.ShoppieMcShopFace.Repositories.CartItemRepository
import org.springframework.stereotype.Service

@Service
class CartItemService(private val repository: CartItemRepository) {

    fun getAllItems(): List<CartItem> = repository.findAll()

    fun getItemById(id: Long): CartItem = repository.findById(id).orElseThrow()

    fun createItem(item: CartItem): CartItem = repository.save(item)

    fun updateItem(id: Long, newItem: CartItem): CartItem {
        return repository.findById(id).map { existingItem ->
            existingItem.product = newItem.product
            existingItem.quantity = newItem.quantity
            repository.save(existingItem)
        }.orElseThrow()
    }

    fun deleteItem(id: Long) = repository.deleteById(id)
}