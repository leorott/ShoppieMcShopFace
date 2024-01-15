package ch.torata.ShoppieMcShopFace

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.slf4j.LoggerFactory
import ch.torata.ShoppieMcShopFace.Entities.Customer
import ch.torata.ShoppieMcShopFace.Entities.Product
import ch.torata.ShoppieMcShopFace.Entities.ShoppingCart
import ch.torata.ShoppieMcShopFace.Repositories.CustomerRepository
import ch.torata.ShoppieMcShopFace.Repositories.ProductRepository
import ch.torata.ShoppieMcShopFace.Repositories.ShoppingCartRepository

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
    fun demo(
			customerRepository: CustomerRepository,
			productRepository: ProductRepository,
			shoppingCartRepository: ShoppingCartRepository
	): CommandLineRunner {
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

			customerRepository.save(newCustomer)

			val product1 = Product(
					name = "Kaffeebohnen Rustico",
					price = 37.0,
					description = "lorem ipsum bla bla bla",
					category = "kaffeebohnen"
			);

			val product2 = Product(
					name = "Kaffeebohnen Intenso",
					price = 48.0,
					description = "lorem ipsum bla bla bla",
					category = "kaffeebohnen"
			);

			val product3 = Product(
					name = "Kaffeefilter",
					price = 107.70,
					description = "lorem ipsum bla bla bla",
					category = "kaffeezubehör"
			);

			productRepository.save(product1)
			productRepository.save(product2)
			productRepository.save(product3)

            log.info("Customers found with findAll():")
            log.info("-----------------------------")
            for (customer in customerRepository.findAll()) {
                log.info(customer.toString())
            }
            log.info("")
        }
    }


}
