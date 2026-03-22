package com.spotgourmet.minimarket.pos.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "distritos", schema = "minimarket",
        uniqueConstraints = @UniqueConstraint(columnNames = {"canton_id", "nombre"}))
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Distrito {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "canton_id", nullable = false)
    private Canton canton;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "is_active", nullable = false)
    private boolean active;
}

