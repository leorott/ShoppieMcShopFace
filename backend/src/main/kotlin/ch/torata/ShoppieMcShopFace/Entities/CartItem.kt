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
    var product: Product? = null,

    var quantity: Int = 0
)