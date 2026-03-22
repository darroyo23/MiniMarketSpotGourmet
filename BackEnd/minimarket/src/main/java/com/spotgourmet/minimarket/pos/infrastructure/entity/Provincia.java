package com.spotgourmet.minimarket.pos.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "provincias", schema = "minimarket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Provincia {
    @Id
    private Long id;

    @Column(name = "nombre", nullable = false, unique = true, length = 100)
    private String nombre;

    @Column(name = "is_active", nullable = false)
    private boolean active;
}

