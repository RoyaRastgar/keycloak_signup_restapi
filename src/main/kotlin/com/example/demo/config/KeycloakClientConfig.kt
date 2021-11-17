package com.example.demo.config

import org.keycloak.OAuth2Constants.CLIENT_CREDENTIALS
import org.keycloak.OAuth2Constants.PASSWORD
import org.keycloak.admin.client.Keycloak
import org.keycloak.admin.client.KeycloakBuilder
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class KeycloakClientConfig(
//    @Value("\${keycloak.credentials.username}")
//    private val username: String,
//    @Value("\${keycloak.credentials.password}")
//    private val password: String,
//    @Value("\${keycloak.credentials.secret}")
//    private val secret: String,
//    @Value("\${keycloak.resource}")
//    private val clientId: String,
//    @Value("\${keycloak.auth-server-url}")
//    private val authUrl: String,
//    @Value("\${keycloak.realm}")
//    private val realm: String
) {

    @Bean
    fun keycloak() : Keycloak {
        return KeycloakBuilder.builder()
            .grantType(CLIENT_CREDENTIALS)
            .serverUrl("http://localhost:8090/auth")
            .realm("example")
            .clientId("admin-spring-boot")
            .clientSecret("c8b85a9b-5e3b-4281-aab7-849dcab67287")
//            .username("admin")
//            .password("admin")
            .build()
    }


}