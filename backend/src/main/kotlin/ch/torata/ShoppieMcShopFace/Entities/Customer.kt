package ch.torata.ShoppieMcShopFace.Entities


import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
class Customer (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,
    private var firstName: String? = null,
    private var lastName: String? = null,
    private var email: String? = null,
    private var password: String? = null,
    private var address: String? = null,
    private var city: String? = null,
    private var zip: String? = null,
    private var country: String? = null,
    private var phone: String? = null,
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "shopping_cart_id", referencedColumnName = "id")
    val shoppingCart: ShoppingCart? = null
)
