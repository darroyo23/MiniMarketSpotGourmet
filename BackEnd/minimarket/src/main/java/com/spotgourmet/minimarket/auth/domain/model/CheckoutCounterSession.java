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
public class CheckoutCounterSession {
    private BigInteger id;
    private BigInteger cashierId;     // FK to User
    private Instant openedAt;
    private Instant closedAt;
    private BigDecimal openingAmount;
    private BigDecimal closingAmount;
    private BigDecimal diferenceAmount;
    private String status;            // OPEN / CLOSED
    private BigInteger createdBy;
    private BigInteger updatedBy;
}
