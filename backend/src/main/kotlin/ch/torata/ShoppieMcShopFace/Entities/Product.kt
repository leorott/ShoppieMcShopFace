package ch.torata.ShoppieMcShopFace.Entities
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import org.springframework.data.annotation.Id


@Entity
class Product (
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Long? = null,

    private val name: String? = null,

    private val price: Double? = null,

    private val size: String? = null,

    private val description: String? = null,

    private val category: String? = null,

    private val picture: String? = null,

    private val stock: Int? = null,

    private val rating: Int? = null,

    private val review: String? = null,

    private val date: String? = null,

    private val time: String? = null,

    private val location: String? = null,

    private val status: String? = null
)
