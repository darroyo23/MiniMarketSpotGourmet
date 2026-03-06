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
public class UserRole {
    private BigInteger userId;    // FK to User
    private BigInteger roleId;    // FK to Role
    private boolean primary;      // is_primary
    private boolean active;

    private Instant createdAt;
    private BigInteger createdBy;
    private Instant updatedAt;
    private BigInteger updatedBy;
}
