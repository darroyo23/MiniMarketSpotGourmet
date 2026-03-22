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
public class CheckoutCounterSessionModel {
    private Long id;
    private Long cashierId;     // FK to User
    private Instant openedAt;
    private Instant closedAt;
    private BigDecimal openingAmount;
    private BigDecimal closingAmount;
    private BigDecimal diferenceAmount;
    private String status;            // OPEN / CLOSED
    private UserModel createdBy;
    private UserModel updatedBy;
}
