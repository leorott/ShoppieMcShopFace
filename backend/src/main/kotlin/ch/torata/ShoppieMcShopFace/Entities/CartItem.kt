package ch.torata.ShoppieMcShopFace.Entities
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

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