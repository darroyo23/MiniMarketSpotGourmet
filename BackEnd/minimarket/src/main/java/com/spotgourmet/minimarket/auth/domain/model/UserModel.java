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
public class UserModel {
    private Long id;

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
    private UserModel createdBy;
    private Instant updatedAt;
    private UserModel updatedBy;

    // Example: roles could be added later
    // private Set<RoleModel> roles;
}

