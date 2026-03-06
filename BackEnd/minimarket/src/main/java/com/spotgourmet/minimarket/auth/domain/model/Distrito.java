package com.spotgourmet.minimarket.auth.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Distrito {
    private BigInteger id;
    private BigInteger cantonId;      // FK to Canton
    private String nombre;
    private boolean active;
}

