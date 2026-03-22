package com.spotgourmet.minimarket.auth.infrastructure.persistence.entity;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.id.RolePermissionId;
import jakarta.persistence.*;
import lombok.*;


import java.time.Instant;

@Entity
@Table(name = "role_permissions", schema = "minimarket")
@IdClass(RolePermissionId.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RolePermission {
    @Id
    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Id
    @ManyToOne
    @JoinColumn(name = "permission_id", nullable = false)
    private Permission permission;

    @Column(name = "is_active", nullable = false)
    private boolean active;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private UserEntity createdBy;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @ManyToOne
    @JoinColumn(name = "updated_by")
    private UserEntity updatedBy;
}

