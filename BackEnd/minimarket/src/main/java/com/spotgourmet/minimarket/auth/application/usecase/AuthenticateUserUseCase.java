package com.spotgourmet.minimarket.auth.application.usecase;

import com.spotgourmet.minimarket.auth.application.dto.LoginRequest;
import com.spotgourmet.minimarket.auth.application.dto.LoginResponse;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.RefreshToken;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.repository.JpaRefreshTokenRepository;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.repository.JpaUserRepository;
import com.spotgourmet.minimarket.auth.infrastructure.security.JwtProvider;
import com.spotgourmet.minimarket.shared.exception.ResourceNotFoundException;
import com.spotgourmet.minimarket.shared.exception.UnauthorizedException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class AuthenticateUserUseCase {

    private final JpaUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtProvider jwtProvider;
    private final JpaRefreshTokenRepository refreshTokenRepository;

    public AuthenticateUserUseCase(
            JpaUserRepository userRepository,
            PasswordEncoder passwordEncoder,
            JwtProvider jwtProvider,
            JpaRefreshTokenRepository refreshTokenRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtProvider = jwtProvider;
        this.refreshTokenRepository = refreshTokenRepository;
    }

    public LoginResponse authenticate(LoginRequest request) {

        var user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new ResourceNotFoundException("User not found with email: " + request.getEmail()));

        if (!passwordEncoder.matches(request.getPassword(), user.getPasswordHash())) {
            throw new UnauthorizedException("Invalid credentials");
        }

        String jwt = jwtProvider.generateToken(user.getEmail());

        String refreshTokenValue = UUID.randomUUID().toString();

        RefreshToken refreshToken = new RefreshToken();
        refreshToken.setUser(user);
        refreshToken.setTokenHash(refreshTokenValue);
        refreshToken.setExpiresAt(Instant.now().plusSeconds(60 * 60 * 24));
        refreshToken.setRevoked(false);
        refreshToken.setCreatedAt(Instant.now());

        refreshTokenRepository.save(refreshToken);

        return new LoginResponse(jwt, refreshTokenValue);
    }
}
