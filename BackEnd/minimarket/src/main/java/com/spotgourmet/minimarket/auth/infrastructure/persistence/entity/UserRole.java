package com.spotgourmet.minimarket.auth.infrastructure.persistence.entity;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.id.UserRoleId;
import jakarta.persistence.*;
import lombok.*;


import java.time.Instant;

@Entity
@Table(name = "user_roles", schema = "minimarket")
@IdClass(UserRoleId.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRole {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Id
    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Column(name = "is_primary", nullable = false)
    private boolean primary;

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

