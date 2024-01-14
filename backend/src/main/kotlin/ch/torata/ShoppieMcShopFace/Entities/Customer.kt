package ch.torata.ShoppieMcShopFace.Entities


import jakarta.persistence.*

@Entity
data class Customer (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,
    private var firstName: String? = null,
    private var lastName: String? = null,
    var email: String? = null,
    var password: String? = null,
    private var address: String? = null,
    private var city: String? = null,
    private var zip: String? = null,
    private var country: String? = null,
    private var phone: String? = null,
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "shopping_cart_id", referencedColumnName = "id")
    val shoppingCart: ShoppingCart? = null
)
