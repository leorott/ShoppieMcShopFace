package ch.torata.ShoppieMcShopFace.Repositories

import Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(lastName: String): List<Customer>
    fun findByEmail(email: String): List<Customer>
    fun findByCity(city: String): List<Customer>
    fun findByCountry(country: String): List<Customer>
    fun findByFirstNameAndLastName(firstName: String, lastName: String): List<Customer>
}

