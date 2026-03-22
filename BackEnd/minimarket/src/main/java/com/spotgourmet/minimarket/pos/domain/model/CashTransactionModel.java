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
public class CashTransactionModel {
    private Long id;
    private Long sessionId;     // FK to CheckoutCounterSessionModel
    private String transactionType;   // SALE, WITHDRAWAL, DEPOSIT, ADJUSTMENT
    private String paymentType;       // CARD, CASH, SINPE_MOVIL
    private BigDecimal amount;
    private String description;

    private Instant createdAt;
    private UserModel createdBy;
}
