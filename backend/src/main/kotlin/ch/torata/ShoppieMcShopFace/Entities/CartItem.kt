package ch.torata.ShoppieMcShopFace.Entities
import jakarta.persistence.*

@Entity
data class CartItem(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne
    val shoppingCart: ShoppingCart? = null,

    @ManyToOne
    val product: Product? = null,

    val quantity: Int = 0
)