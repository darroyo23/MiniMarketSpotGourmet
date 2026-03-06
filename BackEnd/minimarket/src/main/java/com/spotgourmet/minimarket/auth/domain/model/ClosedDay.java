package com.spotgourmet.minimarket.auth.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;
import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClosedDay {
    private LocalDate date;       // PK
    private String reason;
    private boolean active;

    private Instant createdAt;
    private BigInteger createdBy;
    private Instant updatedAt;
    private BigInteger updatedBy;
}

