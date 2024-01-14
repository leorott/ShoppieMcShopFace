package ch.torata.ShoppieMcShopFace.Entities
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id;


@Entity
data class Product (

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
     var id: Long? = null,
    var name: String? = null,
    var price: Double? = null,
    var size: String? = null,
    var description: String? = null,
    var category: String? = null,
    var picture: String? = null,
    var stock: Int? = null,
    var rating: Int? = null,
    var review: String? = null,
    var date: String? = null,
    var time: String? = null,
    var location: String? = null,
    var status: String? = null
)
