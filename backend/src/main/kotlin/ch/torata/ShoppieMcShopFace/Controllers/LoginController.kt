package ch.torata.ShoppieMcShopFace.Controllers

import ch.torata.ShoppieMcShopFace.Security.JwtUtil
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController {

    @GetMapping("/secret")
    fun secret(): String {
        val authentication = SecurityContextHolder.getContext().authentication
        val user = authentication.principal as UserDetails
        val jwtToken = JwtUtil().generateToken(user)
        return jwtToken
    }
}