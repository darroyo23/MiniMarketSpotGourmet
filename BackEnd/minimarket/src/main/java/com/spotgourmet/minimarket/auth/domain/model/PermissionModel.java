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
public class PermissionModel {
    private Long id;
    private Long groupId;   // FK to PermissionGroupModel
    private String code;          // e.g., ORDERS_CREATE
    private String name;
    private String description;
    private boolean active;

    private Instant createdAt;
    private UserModel createdBy;
    private Instant updatedAt;
    private UserModel updatedBy;
}

