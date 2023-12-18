package ch.torata.ShoppieMcShopFace

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.slf4j.LoggerFactory
import Customer
import ch.torata.ShoppieMcShopFace.Repositories.CustomerRepository

@SpringBootApplication
class ShoppieMcShopFaceApplication

private val log = LoggerFactory.getLogger(ShoppieMcShopFaceApplication::class.java)

fun main(args: Array<String>) {
	runApplication<ShoppieMcShopFaceApplication>(*args)
}
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean

@Bean
fun demo(repository: CustomerRepository): CommandLineRunner {
	return CommandLineRunner { args ->
		repository.save(Customer())
		repository.save(Customer("Chloe", "O'Brian"))
		repository.save(Customer("Kim", "Bauer"))
		repository.save(Customer("David", "Palmer"))
		repository.save(Customer("Michelle", "Dessler"))

		log.info("Customers found with findAll():")
		log.info("-----------------------------")
		for (customer in repository.findAll()) {
			log.info(customer.toString())
		}
		log.info("")
	}
}

