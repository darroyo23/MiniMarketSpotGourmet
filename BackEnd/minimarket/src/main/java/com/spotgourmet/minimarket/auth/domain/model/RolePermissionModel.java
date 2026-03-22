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
public class RolePermissionModel {
    private Long roleId;        // FK to RoleModel
    private Long permissionId;  // FK to PermissionModel
    private boolean active;

    private Instant createdAt;
    private UserModel createdBy;
    private Instant updatedAt;
    private UserModel updatedBy;
}
