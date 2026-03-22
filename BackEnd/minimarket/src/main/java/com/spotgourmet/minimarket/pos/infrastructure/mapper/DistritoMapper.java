package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.pos.domain.model.DistritoModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Canton;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Distrito;
import org.mapstruct.*;



@Mapper(componentModel = "spring")
public interface DistritoMapper {

    // ─── Entity → Domain ────────────────────────────────────────────────────────

    @Mapping(target = "cantonId", source = "canton.id")
    DistritoModel toModel(Distrito entity);

    // ─── Domain → Entity ────────────────────────────────────────────────────────

    @Mapping(target = "canton", source = "cantonId", qualifiedByName = "idToCanton")
    Distrito toEntity(DistritoModel model);

    @Named("idToCanton")
    default Canton idToCanton(Long id) {
        if (id == null) return null;
        Canton c = new Canton();
        c.setId(id);
        return c;
    }
}
