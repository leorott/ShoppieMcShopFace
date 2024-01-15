package ch.torata.ShoppieMcShopFace.Entities


import jakarta.persistence.*

@Entity
data class Customer (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var email: String? = null,
    var password: String? = null,
    var address: String? = null,
    var city: String? = null,
    var zip: String? = null,
    var country: String? = null,
    var phone: String? = null,
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "shopping_cart_id", referencedColumnName = "id")
    val shoppingCart: ShoppingCart? = null
)
