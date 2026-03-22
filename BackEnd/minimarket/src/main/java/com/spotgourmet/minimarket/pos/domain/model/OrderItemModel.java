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
public class OrderItemModel {
    private Long id;
    private Long orderId;       // FK to OrderModel
    private Long productId;     // FK to ProductModel
    private Integer quantity;
    private BigDecimal unitPrice;
    private boolean active;

    private Instant createdAt;
    private UserModel createdBy;
    private Instant updatedAt;
    private UserModel updatedBy;
}
