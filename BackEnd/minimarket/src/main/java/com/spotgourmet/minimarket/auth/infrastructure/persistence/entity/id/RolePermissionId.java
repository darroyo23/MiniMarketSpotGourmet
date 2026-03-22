package com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.id;

import java.io.Serializable;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class RolePermissionId implements Serializable {
    private Long role;
    private Long permission;
}

