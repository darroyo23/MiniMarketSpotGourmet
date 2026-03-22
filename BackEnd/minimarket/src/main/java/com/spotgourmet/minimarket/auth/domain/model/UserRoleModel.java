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
public class UserRoleModel {
    private Long userId;    // FK to User
    private Long roleId;    // FK to RoleModel
    private boolean primary;      // is_primary
    private boolean active;

    private Instant createdAt;
    private UserModel createdBy;
    private Instant updatedAt;
    private UserModel updatedBy;
}
