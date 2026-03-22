package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.pos.domain.model.ProvinciaModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Provincia;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProvinciaMapper {

    ProvinciaModel toModel(Provincia entity);

    Provincia toEntity(ProvinciaModel model);
}
