package com.spotgourmet.minimarket.pos.domain.model;

import com.spotgourmet.minimarket.auth.domain.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.Instant;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComboAvailabilityModel {
    private Long id;
    private Long comboId;     // FK to ComboModel
    private Integer dayOfWeek;      // 0 = Sunday, 6 = Saturday
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean active;

    private Instant createdAt;
    private UserModel createdBy;
    private Instant updatedAt;
    private UserModel updatedBy;
}
