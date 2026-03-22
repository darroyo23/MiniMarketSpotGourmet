package com.spotgourmet.minimarket.pos.infrastructure.entity.id;

import java.io.Serializable;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComboItemId implements Serializable {
    private Long combo;
    private Long product;
}

