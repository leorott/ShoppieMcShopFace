package ch.torata.ShoppieMcShopFace

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.slf4j.LoggerFactory

@SpringBootApplication
class ShoppieMcShopFaceApplication

private val log = LoggerFactory.getLogger(ShoppieMcShopFaceApplication::class.java)

fun main(args: Array<String>) {
	runApplication<ShoppieMcShopFaceApplication>(*args)
}
