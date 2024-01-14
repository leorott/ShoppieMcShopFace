package ch.torata.ShoppieMcShopFace.Repositories

import ch.torata.ShoppieMcShopFace.Entities.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Customer, Long>