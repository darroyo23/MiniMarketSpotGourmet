package com.spotgourmet.minimarket.pos.infrastructure.entity;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "checkout_counter_session", schema = "minimarket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CheckoutCounterSession {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_checkout_counter_id")
    @SequenceGenerator(name = "seq_checkout_counter_id", sequenceName = "minimarket.seq_checkout_counter_id", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cashier_id", nullable = false)
    private UserEntity cashier;

    @Column(name = "opened_at", nullable = false)
    private Instant openedAt;

    @Column(name = "closed_at")
    private Instant closedAt;

    @Column(name = "opening_amount", nullable = false)
    private BigDecimal openingAmount;

    @Column(name = "closing_amount")
    private BigDecimal closingAmount;

    @Column(name = "diference_amount")
    private BigDecimal diferenceAmount;

    @Column(name = "status", nullable = false)
    private String status; // OPEN / CLOSED

    @ManyToOne
    @JoinColumn(name = "created_by")
    private UserEntity createdBy; // ✅ uniformizado: era Long

    @ManyToOne
    @JoinColumn(name = "updated_by")
    private UserEntity updatedBy; // ✅ uniformizado: era Long
}
