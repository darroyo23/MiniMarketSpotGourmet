package com.spotgourmet.minimarket.auth.api.controller;

import com.spotgourmet.minimarket.auth.application.dto.LoginRequest;
import com.spotgourmet.minimarket.auth.application.dto.LoginResponse;
import com.spotgourmet.minimarket.auth.application.usecase.AuthenticateUserUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticateUserUseCase authenticateUserUseCase;

    public AuthController(AuthenticateUserUseCase authenticateUserUseCase) {
        this.authenticateUserUseCase = authenticateUserUseCase;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest logInRequest) {
        return ResponseEntity.ok(authenticateUserUseCase.authenticate(logInRequest));
    }
}
