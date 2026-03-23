package com.spotgourmet.minimarket.auth.infrastructure.persistence.repository;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.RefreshTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.Optional;

public interface JpaRefreshTokenRepository extends JpaRepository<RefreshTokenEntity, Long> {

    Optional<RefreshTokenEntity> findByToken(String token);

    int deleteByExpiresAtBeforeOrRevokedTrue(Instant now);
}