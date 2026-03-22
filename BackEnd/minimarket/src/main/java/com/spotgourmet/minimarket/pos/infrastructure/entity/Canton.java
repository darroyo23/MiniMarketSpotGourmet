package com.spotgourmet.minimarket.pos.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cantones", schema = "minimarket",
        uniqueConstraints = @UniqueConstraint(columnNames = {"provincia_id", "nombre"}))
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Canton {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "provincia_id", nullable = false)
    private Provincia provincia;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "is_active", nullable = false)
    private boolean active;
}

