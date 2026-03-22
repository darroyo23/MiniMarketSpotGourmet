package com.spotgourmet.minimarket.pos.infrastructure.entity;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;


import java.time.Instant;

@Entity
@Table(name = "orders", schema = "minimarket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_orders_id")
    @SequenceGenerator(name = "seq_orders_id", sequenceName = "minimarket.seq_orders_id", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(name = "fulfillment_type", nullable = false)
    private String fulfillmentType; // pickup | delivery

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "payment_confirmed", nullable = false)
    private boolean paymentConfirmed;

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
