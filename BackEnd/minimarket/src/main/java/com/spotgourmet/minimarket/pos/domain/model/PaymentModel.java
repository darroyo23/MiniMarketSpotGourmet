package com.spotgourmet.minimarket.pos.domain.model;

import com.spotgourmet.minimarket.auth.domain.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PaymentModel {
    private Long id;
    private Long orderId;    // FK to OrderModel
    private String method;         // e.g., CARD, CASH, SINPE_MOVIL
    private String status;         // e.g., PENDING, PAID, FAILED
    private Instant paidAt;
    private boolean active;

    private Instant createdAt;
    private UserModel createdBy;
    private Instant updatedAt;
    private UserModel updatedBy;
}
