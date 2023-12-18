import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import org.springframework.data.annotation.Id

@Entity
class Customer (
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Long? = null,
    private val firstName: String? = null,
    private val lastName: String? = null,
    private val email: String? = null,
    private val password: String? = null,
    private val address: String? = null,
    private val city: String? = null,
    private val zip: String? = null,
    private val country: String? = null,
    private val phone: String? = null
)
