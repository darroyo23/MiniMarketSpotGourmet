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
public class Canton {
    private BigInteger id;
    private BigInteger provinciaId;   // FK to Provincia
    private String nombre;
    private boolean active;
}

