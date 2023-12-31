package me.choicore.likeapuppy.authentication.common.properties

import org.springframework.boot.context.properties.ConfigurationProperties


@ConfigurationProperties(prefix = "jwt")
data class JwtProperties(
    val issuer: String,
    val accessExpirationTime: Long,
    val refreshExpirationTime: Long,
    // val expiration: Expiration,
) {
//    data class Expiration(
//        val accessToken: Long,
//        val refreshToken: Long,
//    )
}


