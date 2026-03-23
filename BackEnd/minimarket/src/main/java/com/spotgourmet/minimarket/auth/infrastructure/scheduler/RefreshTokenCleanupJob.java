package com.spotgourmet.minimarket.auth.infrastructure.scheduler;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.repository.JpaRefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
@Slf4j
public class RefreshTokenCleanupJob {

    private final JpaRefreshTokenRepository repository;

    @Scheduled(cron = "0 0 * * * *") // cada hora
    public void cleanExpiredTokens() {

        int deleted = repository.deleteByExpiresAtBeforeOrRevokedTrue(Instant.now());

        log.info("Deleted {} expired/revoked refresh tokens", deleted);
    }
}