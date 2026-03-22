package com.spotgourmet.minimarket.auth.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.Instant;

@Entity
@Table(name = "permission_groups", schema = "minimarket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PermissionGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_permission_groups_id")
    @SequenceGenerator(name = "seq_permission_groups_id", sequenceName = "minimarket.seq_permission_groups_id", allocationSize = 1)
    private Long id;

    @Column(name = "code", nullable = false, unique = true)
    private String code; // e.g., ORDERS, USERS, CATALOG

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

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

