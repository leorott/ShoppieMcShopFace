
package ch.torata.ShoppieMcShopFace.Security

import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer
import org.springframework.security.core.userdetails.User
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.security.web.SecurityFilterChain


@Configuration
@EnableWebSecurity
class WebSecurityConfig {
    @Bean
    fun userDetailsService(): InMemoryUserDetailsManager {
        logger.info("Creating user details...")
        val user1 = User.withUsername("user1@example.com").password(passwordEncoder().encode("user1Pass")).build()
        val user2 = User.withUsername("user2@example.com").password(passwordEncoder().encode("user2Pass")).build()
        val admin = User.withUsername("admin@example.com").password(passwordEncoder().encode("adminPass")).build()
        return InMemoryUserDetailsManager(user1, user2, admin)
    }

    //https://reflectoring.io/spring-security/
    @Bean
    @Throws(Exception::class)
    fun filterChain(http: HttpSecurity): SecurityFilterChain? {
        logger.info("Configuring security filter chain...")

        http.formLogin { form: FormLoginConfigurer<HttpSecurity?> ->
            form.loginPage(
                "/login"
            ).permitAll().successForwardUrl("/secret")
        }
        http.logout { logout: LogoutConfigurer<HttpSecurity?> ->
            logout.logoutUrl(
                "/logout/"
            )
        }
        return null
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        logger.info("Creating password encoder...")

        return BCryptPasswordEncoder()
    }

    companion object {
        private val logger: Logger = LogManager.getLogger(
            BCryptPasswordEncoder::class.java
        )
    }
}