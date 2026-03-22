package com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.id;

import java.io.Serializable;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class UserRoleId implements Serializable {
    private Long user;
    private Long role;
}

