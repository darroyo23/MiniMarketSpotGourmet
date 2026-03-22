package com.spotgourmet.minimarket.pos.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CashDenominationModel {
    private Long id;
    private String currency;   // e.g., CRC
    private BigDecimal value;  // e.g., 500, 1000, 2000
    private String type;       // BILL or COIN
    private boolean active;
}
