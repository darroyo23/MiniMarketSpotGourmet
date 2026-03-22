package com.spotgourmet.minimarket.pos.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProvinciaModel {
    private Long id;
    private String nombre;
    private boolean active;
}

