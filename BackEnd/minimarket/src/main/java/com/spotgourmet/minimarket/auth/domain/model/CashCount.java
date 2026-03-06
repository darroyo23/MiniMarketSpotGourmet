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
public class CashCount {
    private BigInteger id;
    private BigInteger sessionId;       // FK to CheckoutCounterSession
    private BigInteger denominationId;  // FK to CashDenomination
    private Integer quantity;
    private BigDecimal total;
    private String countType;           // OPENING / CLOSING

    private Instant createdAt;
    private BigInteger createdBy;
}
