package com.spotgourmet.minimarket.pos.domain.model;

import com.spotgourmet.minimarket.auth.domain.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClosedDayModel {
    private LocalDate date;       // PK
    private String reason;
    private boolean active;

    private Instant createdAt;
    private UserModel createdBy;
    private Instant updatedAt;
    private UserModel updatedBy;
}

