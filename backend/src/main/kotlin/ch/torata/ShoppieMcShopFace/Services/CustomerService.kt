package ch.torata.ShoppieMcShopFace.Services

import ch.torata.ShoppieMcShopFace.Entities.Customer
import ch.torata.ShoppieMcShopFace.Repositories.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(private val repository: CustomerRepository) {

    fun getAllCustomers(): List<Customer> = repository.findAll()

    fun getCustomerById(id: Long): Customer = repository.findById(id).orElseThrow()

    fun createCustomer(customer: Customer): Customer = repository.save(customer)

    fun updateCustomer(id: Long, newCustomer: Customer): Customer {
        return repository.findById(id).map { existingCustomer ->
            existingCustomer.firstName = newCustomer.firstName
            existingCustomer.lastName = newCustomer.lastName
            existingCustomer.email = newCustomer.email
            existingCustomer.password = newCustomer.password
            existingCustomer.address = newCustomer.address
            existingCustomer.city = newCustomer.city
            existingCustomer.zip = newCustomer.zip
            existingCustomer.country = newCustomer.country
            existingCustomer.phone = newCustomer.phone
            repository.save(existingCustomer)
        }.orElseThrow()
    }

    fun deleteCustomer(id: Long) = repository.deleteById(id)
}