package com.spotgourmet.minimarket.pos.infrastructure.entity;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;


import java.time.Instant;

@Entity
@Table(name = "limit_rules", schema = "minimarket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LimitRule {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_limit_rules_id")
    @SequenceGenerator(name = "seq_limit_rules_id", sequenceName = "minimarket.seq_permission_groups_id", allocationSize = 1)
    private Long id;

    @Column(name = "rule_type")
    private String ruleType;

    @Column(name = "value")
    private Integer value;

    @Column(name = "scope")
    private String scope;

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
