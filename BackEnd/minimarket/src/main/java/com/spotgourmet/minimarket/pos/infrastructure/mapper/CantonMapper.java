package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.pos.domain.model.CantonModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Canton;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Provincia;
import org.mapstruct.*;



@Mapper(componentModel = "spring")
public interface CantonMapper {

    // ─── Entity → Domain ────────────────────────────────────────────────────────

    @Mapping(target = "provinciaId", source = "provincia.id")
    CantonModel toModel(Canton entity);

    // ─── Domain → Entity ────────────────────────────────────────────────────────

    @Mapping(target = "provincia", source = "provinciaId", qualifiedByName = "idToProvincia")
    Canton toEntity(CantonModel model);

    @Named("idToProvincia")
    default Provincia idToProvincia(Long id) {
        if (id == null) return null;
        Provincia p = new Provincia();
        p.setId(id);
        return p;
    }
}
