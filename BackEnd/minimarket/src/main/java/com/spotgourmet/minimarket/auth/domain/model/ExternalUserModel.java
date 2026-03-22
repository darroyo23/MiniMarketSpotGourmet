package com.spotgourmet.minimarket.auth.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExternalUserModel {
    private Long id;

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
    private Long provinciaId;
    private Long cantonId;
    private Long distritoId;

    // Economic activity
    private Long economicActivityId;

    // Status
    private boolean active;

    // Audit fields
    private Instant createdAt;
    private UserModel createdBy;
    private Instant updatedAt;
    private UserModel updatedBy;
}
