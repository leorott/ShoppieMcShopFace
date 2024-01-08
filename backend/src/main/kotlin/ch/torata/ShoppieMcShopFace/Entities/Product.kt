package ch.torata.ShoppieMcShopFace.Entities
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id;


@Entity
class Product (

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private var id: Long? = null,
    private var name: String? = null,
    private var price: Double? = null,
    private var size: String? = null,
    private var description: String? = null,
    private var category: String? = null,
    private var picture: String? = null,
    private var stock: Int? = null,
    private var rating: Int? = null,
    private var review: String? = null,
    private var date: String? = null,
    private var time: String? = null,
    private var location: String? = null,
    private var status: String? = null
)
