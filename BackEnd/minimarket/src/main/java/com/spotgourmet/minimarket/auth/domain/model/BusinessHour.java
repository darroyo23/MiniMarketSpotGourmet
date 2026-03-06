package com.spotgourmet.minimarket.auth.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BusinessHour {
    private BigInteger id;
    private String fulfillmentType;   // pickup | delivery
    private Integer dayOfWeek;        // 0 = Sunday, 6 = Saturday
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean active;

    private Instant createdAt;
    private BigInteger createdBy;
    private Instant updatedAt;
    private BigInteger updatedBy;
}

