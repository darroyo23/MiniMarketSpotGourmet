package com.spotgourmet.minimarket.pos.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DistritoModel {
    private Long id;
    private Long cantonId;      // FK to CantonModel
    private String nombre;
    private boolean active;
}

