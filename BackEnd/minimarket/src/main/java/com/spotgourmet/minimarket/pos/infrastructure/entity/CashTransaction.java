package com.spotgourmet.minimarket.pos.infrastructure.entity;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "cash_transaction", schema = "minimarket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CashTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_checkout_counter_desc_id")
    @SequenceGenerator(name = "seq_checkout_counter_desc_id", sequenceName = "minimarket.seq_checkout_counter_desc_id", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "session_id", nullable = false)
    private CheckoutCounterSession session;

    @Column(name = "transaction_type", nullable = false)
    private String transactionType;

    @Column(name = "payment_type", nullable = false)
    private String paymentType;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private UserEntity createdBy; // ✅ uniformizado: era Long
}
