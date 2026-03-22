package com.spotgourmet.minimarket.pos.infrastructure.entity;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "cash_count", schema = "minimarket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CashCount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id_cash_count")
    @SequenceGenerator(name = "seq_id_cash_count", sequenceName = "minimarket.seq_id_cash_count", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "session_id", nullable = false)
    private CheckoutCounterSession session;

    @ManyToOne
    @JoinColumn(name = "denomination_id", nullable = false)
    private CashDenomination denomination;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "total", nullable = false)
    private BigDecimal total;

    @Column(name = "count_type", nullable = false)
    private String countType; // OPENING / CLOSING

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private UserEntity createdBy; // ✅ uniformizado: era Long
}
