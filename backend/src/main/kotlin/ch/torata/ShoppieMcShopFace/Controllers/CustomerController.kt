package ch.torata.ShoppieMcShopFace.Controllers

import ch.torata.ShoppieMcShopFace.Entities.Customer
import ch.torata.ShoppieMcShopFace.Repositories.CustomerRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController(private val repository: CustomerRepository) {

    @GetMapping
    fun findAll() = repository.findAll()

    @PostMapping
    fun addCustomer(@RequestBody customer: Customer) = repository.save(customer)

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long) = repository.findById(id)

    @PutMapping("/{id}")
    fun updateCustomer(@RequestBody newCustomer: Customer, @PathVariable id: Long) {
        repository.findById(id).map { existingCustomer ->
            val updatedCustomer: Customer = existingCustomer
                .copy(email = newCustomer.email, password = newCustomer.password)
            repository.save(updatedCustomer)
        }
    }

    @DeleteMapping("/{id}")
    fun removeCustomer(@PathVariable id: Long) = repository.deleteById(id)
}