package com.spotgourmet.minimarket.pos.infrastructure.entity;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "combos", schema = "minimarket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Combo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_combos_id")
    @SequenceGenerator(name = "seq_combos_id", sequenceName = "minimarket.seq_combos_id", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

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

