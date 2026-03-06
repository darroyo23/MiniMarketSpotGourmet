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
public class ExternalUser {
    private BigInteger id;

    // Identification
    private Integer idType;
    private Integer idNumber;

    // Personal information
    private String name;
    private String middleName;
    private String lastName;
    private String secondLastName;

    // Contact information
    private Integer phoneNumber;
    private String email;
    private String passwordHash;

    // Location references
    private BigInteger provinciaId;
    private BigInteger cantonId;
    private BigInteger distritoId;

    // Economic activity
    private BigInteger economicActivityId;

    // Status
    private boolean active;

    // Audit fields
    private Instant createdAt;
    private BigInteger createdBy;
    private Instant updatedAt;
    private BigInteger updatedBy;
}
