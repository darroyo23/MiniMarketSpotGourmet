package com.spotgourmet.minimarket.auth.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CashDenomination {
    private BigInteger id;
    private String currency;   // e.g., CRC
    private BigDecimal value;  // e.g., 500, 1000, 2000
    private String type;       // BILL or COIN
    private boolean active;
}
