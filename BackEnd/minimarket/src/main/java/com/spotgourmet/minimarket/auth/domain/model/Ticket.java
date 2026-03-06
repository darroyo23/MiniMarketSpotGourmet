package com.spotgourmet.minimarket.auth.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ticket {
    private BigInteger id;
    private BigInteger orderId;   // FK to Order
    private boolean active;

    private Instant createdAt;
    private BigInteger createdBy;
    private Instant updatedAt;
    private BigInteger updatedBy;
}
