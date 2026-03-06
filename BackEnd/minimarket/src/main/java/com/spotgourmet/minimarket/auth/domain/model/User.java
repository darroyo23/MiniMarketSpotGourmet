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
public class User {
    private BigInteger id;

    // Core identity
    private String userName;
    private String name;
    private String lastName;

    // Contact & authentication
    private String email;
    private String passwordHash;

    // Status
    private boolean active;

    // Audit fields
    private Instant createdAt;
    private BigInteger createdBy;
    private Instant updatedAt;
    private BigInteger updatedBy;

    // Example: roles could be added later
    // private Set<Role> roles;
}

