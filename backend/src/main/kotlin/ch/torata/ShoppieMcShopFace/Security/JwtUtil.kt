package ch.torata.ShoppieMcShopFace.Security

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import io.jsonwebtoken.security.Keys
import org.springframework.security.core.userdetails.UserDetails
import java.util.*

class JwtUtil {
    private val SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256)

    fun generateToken(userDetails: UserDetails): String {
        val claims = HashMap<String, Any>()
        return Jwts.builder()
            .setClaims(claims)
            .setSubject(userDetails.username)
            .setIssuedAt(Date(System.currentTimeMillis()))
            .setExpiration(Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 hours
            .signWith(SECRET_KEY)
            .compact()
    }
}