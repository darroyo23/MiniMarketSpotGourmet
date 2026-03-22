package com.spotgourmet.minimarket.pos.infrastructure.entity;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;


import java.time.Instant;
import java.time.LocalTime;

@Entity
@Table(name = "business_hours", schema = "minimarket")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BusinessHour {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_business_hours_id")
    @SequenceGenerator(name = "seq_business_hours_id", sequenceName = "minimarket.seq_business_hours_id", allocationSize = 1)
    private Long id;

    @Column(name = "fulfillment_type", nullable = false)
    private String fulfillmentType; // pickup | delivery

    @Column(name = "day_of_week", nullable = false)
    private Integer dayOfWeek;

    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalTime endTime;

    @Column(name = "is_active", nullable = false)
    private boolean active;

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
