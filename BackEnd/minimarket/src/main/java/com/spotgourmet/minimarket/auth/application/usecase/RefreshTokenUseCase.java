package com.spotgourmet.minimarket.auth.application.usecase;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.RefreshTokenEntity;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.repository.JpaRefreshTokenRepository;
import com.spotgourmet.minimarket.auth.infrastructure.security.JwtProvider;
import com.spotgourmet.minimarket.shared.exception.UnauthorizedException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RefreshTokenUseCase {

    private final JpaRefreshTokenRepository refreshTokenRepository;
    private final JwtProvider jwtProvider;

    public String refresh(String refreshToken) {

        RefreshTokenEntity tokenEntity = refreshTokenRepository.findByToken(refreshToken)
                .orElseThrow(() -> new UnauthorizedException("Invalid refresh token"));

        if (tokenEntity.isRevoked() || tokenEntity.getExpiresAt().isBefore(Instant.now())) {
            throw new UnauthorizedException("Refresh token expired or revoked");
        }

        // 🔐 revoke old token
        tokenEntity.setRevoked(true);
        refreshTokenRepository.save(tokenEntity);

        // 🔄 create new refresh token
        String newRefreshToken = UUID.randomUUID().toString();

        RefreshTokenEntity newToken = new RefreshTokenEntity();
        newToken.setToken(newRefreshToken);
        newToken.setUser(tokenEntity.getUser());
        newToken.setExpiresAt(Instant.now().plusSeconds(86400)); // 24h
        newToken.setRevoked(false);
        newToken.setCreatedAt(Instant.now());

        refreshTokenRepository.save(newToken);

        // 🔑 generate new access token
        String newAccessToken = jwtProvider.generateToken(tokenEntity.getUser().getEmail());

        return newAccessToken + "|" + newRefreshToken;
    }
}
