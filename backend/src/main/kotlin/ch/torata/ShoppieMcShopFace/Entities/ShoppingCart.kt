package ch.torata.ShoppieMcShopFace.Entities
import jakarta.persistence.*


@Entity
data class ShoppingCart(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @OneToOne(mappedBy = "shoppingCart")
    var customer: Customer? = null,

    @OneToMany(mappedBy = "shoppingCart", cascade = [CascadeType.ALL], orphanRemoval = true)
    var cartItems: MutableList<CartItem> = mutableListOf()
)