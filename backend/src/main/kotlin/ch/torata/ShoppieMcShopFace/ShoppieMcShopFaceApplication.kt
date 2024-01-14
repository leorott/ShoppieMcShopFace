package ch.torata.ShoppieMcShopFace

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.slf4j.LoggerFactory
import ch.torata.ShoppieMcShopFace.Entities.Customer
import ch.torata.ShoppieMcShopFace.Repositories.CustomerRepository

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean


@SpringBootApplication
class ShoppieMcShopFaceApplication {
    private val log = LoggerFactory.getLogger(ShoppieMcShopFaceApplication::class.java)
	companion object {
		@JvmStatic
	    fun main(args: Array<String>) {
			runApplication<ShoppieMcShopFaceApplication>(*args)
		}
	}

    @Bean
    fun demo(repository: CustomerRepository): CommandLineRunner {
        return CommandLineRunner { args ->
			val newCustomer = Customer(
				firstName = "John",
				lastName = "Doe",
				email = "john.doe@example.com",
				password = "password123",
				address = "123 Main St",
				city = "Cityville",
				zip = "12345",
				country = "Countryland",
				phone = "+123456789"
			)

			repository.save(newCustomer)

            log.info("Customers found with findAll():")
            log.info("-----------------------------")
            for (customer in repository.findAll()) {
                log.info(customer.toString())
            }
            log.info("")
        }
    }


}
