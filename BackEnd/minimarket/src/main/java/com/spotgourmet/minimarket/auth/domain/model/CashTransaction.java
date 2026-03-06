package com.spotgourmet.minimarket.auth.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.Instant;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CashTransaction {
    private BigInteger id;
    private BigInteger sessionId;     // FK to CheckoutCounterSession
    private String transactionType;   // SALE, WITHDRAWAL, DEPOSIT, ADJUSTMENT
    private String paymentType;       // CARD, CASH, SINPE_MOVIL
    private BigDecimal amount;
    private String description;

    private Instant createdAt;
    private BigInteger createdBy;
}
