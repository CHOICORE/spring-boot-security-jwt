package me.choicore.demo.springsecurity.authentication.controller.endpoint

import jakarta.validation.Valid
import me.choicore.demo.springsecurity.authentication.controller.dto.request.SignInRequestDto
import me.choicore.demo.springsecurity.authentication.service.AuthenticationProcessor
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/v1/account")
class AuthenticationApi(
    private val authenticationProcessor: AuthenticationProcessor,
) {

    @PostMapping("/sign-in")
    fun signIn(@RequestBody @Valid signInRequestDto: SignInRequestDto): ResponseEntity<Any> {
        return ResponseEntity.ok(authenticationProcessor.authenticate(signInRequestDto.identifier, signInRequestDto.password))
    }

    @PostMapping("/sign-up")
    fun signUp() {

    }

    @PostMapping("/sign-out")
    fun signOut() {

    }
}