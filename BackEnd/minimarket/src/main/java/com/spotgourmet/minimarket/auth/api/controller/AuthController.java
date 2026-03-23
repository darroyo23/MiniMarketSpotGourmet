package com.spotgourmet.minimarket.auth.api.controller;

import com.spotgourmet.minimarket.auth.application.dto.LoginRequest;
import com.spotgourmet.minimarket.auth.application.dto.LoginResponse;
import com.spotgourmet.minimarket.auth.application.dto.RefreshRequest;
import com.spotgourmet.minimarket.auth.application.usecase.AuthenticateUserUseCase;
import com.spotgourmet.minimarket.auth.application.usecase.RefreshTokenUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticateUserUseCase authenticateUserUseCase;
    private final RefreshTokenUseCase refreshTokenUseCase;


    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest logInRequest) {
        return ResponseEntity.ok(authenticateUserUseCase.authenticate(logInRequest));
    }


    @PostMapping("/refresh")
    public ResponseEntity<?> refresh(@RequestBody RefreshRequest request) {

        String result = refreshTokenUseCase.refresh(request.getRefreshToken());

        String[] tokens = result.split("\\|");

        return ResponseEntity.ok().body(
                Map.of(
                        "accessToken", tokens[0],
                        "refreshToken", tokens[1]
                )
        );
    }

}
