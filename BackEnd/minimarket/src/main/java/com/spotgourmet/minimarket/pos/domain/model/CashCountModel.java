package com.spotgourmet.minimarket.pos.domain.model;

import com.spotgourmet.minimarket.auth.domain.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.Instant;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CashCountModel {
    private Long id;
    private Long sessionId;       // FK to CheckoutCounterSessionModel
    private Long denominationId;  // FK to CashDenominationModel
    private Integer quantity;
    private BigDecimal total;
    private String countType;           // OPENING / CLOSING

    private Instant createdAt;
    private UserModel createdBy;
}
