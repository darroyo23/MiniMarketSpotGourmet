package com.spotgourmet.minimarket.auth.infrastructure.persistence.entity;

import com.spotgourmet.minimarket.pos.infrastructure.entity.Canton;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Distrito;
import com.spotgourmet.minimarket.pos.infrastructure.entity.EconomicActivity;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Provincia;
import jakarta.persistence.*;
import lombok.*;


import java.time.Instant;

@Entity
@Table(name = "external_users", schema = "minimarket",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"id_type", "id_number"}),
                @UniqueConstraint(columnNames = {"email"})
        })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExternalUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_external_users_id")
    @SequenceGenerator(name = "seq_external_users_id", sequenceName = "minimarket.seq_external_users_id", allocationSize = 1)
    private Long id;

    @Column(name = "id_type", nullable = false)
    private Integer idType;

    @Column(name = "id_number", nullable = false)
    private Integer idNumber;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "middle_name", length = 255)
    private String middleName;

    @Column(name = "last_name", nullable = false, length = 255)
    private String lastName;

    @Column(name = "second_last_name", nullable = false, length = 255)
    private String secondLastName;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "email", nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "password_hash", columnDefinition = "TEXT")
    private String passwordHash;

    // Location references
    @ManyToOne
    @JoinColumn(name = "id_provincia")
    private Provincia provincia;

    @ManyToOne
    @JoinColumn(name = "id_canton")
    private Canton canton;

    @ManyToOne
    @JoinColumn(name = "id_distrito")
    private Distrito distrito;

    @ManyToOne
    @JoinColumn(name = "id_economic_activity")
    private EconomicActivity economicActivity;

    @Column(name = "is_active", nullable = false)
    private boolean active;

    // Audit fields
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private UserEntity createdBy;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @ManyToOne
    @JoinColumn(name = "updated_by")
    private UserEntity updatedBy;
}
