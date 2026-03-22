package com.spotgourmet.minimarket.pos.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;

@Entity
@Table(name = "cash_denomination", schema = "minimarket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CashDenomination {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id_cash_denomination")
    @SequenceGenerator(name = "seq_id_cash_denomination", sequenceName = "minimarket.seq_id_cash_denomination", allocationSize = 1)
    private Long id;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "value", nullable = false)
    private BigDecimal value;

    @Column(name = "type", nullable = false)
    private String type; // BILL or COIN

    @Column(name = "is_active", nullable = false)
    private boolean active;
}
