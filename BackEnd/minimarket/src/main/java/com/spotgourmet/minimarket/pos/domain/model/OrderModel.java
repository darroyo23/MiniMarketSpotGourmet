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
public class OrderModel {
    private Long id;
    private Long userId;        // FK to User
    private String fulfillmentType;   // pickup | delivery
    private String status;
    private boolean paymentConfirmed;
    private boolean active;

    private Instant createdAt;
    private UserModel createdBy;
    private Instant updatedAt;
    private UserModel updatedBy;
}
