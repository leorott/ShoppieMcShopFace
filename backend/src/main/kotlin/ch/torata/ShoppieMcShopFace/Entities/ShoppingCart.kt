package ch.torata.ShoppieMcShopFace.Entities
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;


@Entity
data class ShoppingCart(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @OneToOne(mappedBy = "shoppingCart")
    val customer: Customer? = null,

    @OneToMany(mappedBy = "shoppingCart", cascade = [CascadeType.ALL], orphanRemoval = true)
    val cartItems: MutableList<CartItem> = mutableListOf()
)