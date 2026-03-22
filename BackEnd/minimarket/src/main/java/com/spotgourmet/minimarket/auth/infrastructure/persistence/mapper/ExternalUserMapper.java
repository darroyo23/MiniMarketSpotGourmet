package com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper;

import com.spotgourmet.minimarket.auth.domain.model.ExternalUserModel;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.*;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Canton;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Distrito;
import com.spotgourmet.minimarket.pos.infrastructure.entity.EconomicActivity;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Provincia;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ExternalUserMapper {

    @Mapping(target = "provinciaId", source = "provincia.id")
    @Mapping(target = "cantonId", source = "canton.id")
    @Mapping(target = "distritoId", source = "distrito.id")
    @Mapping(target = "economicActivityId", source = "economicActivity.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    ExternalUserModel toModel(ExternalUser entity);

    @Mapping(target = "provincia", source = "provinciaId", qualifiedByName = "idToProvincia")
    @Mapping(target = "canton", source = "cantonId", qualifiedByName = "idToCanton")
    @Mapping(target = "distrito", source = "distritoId", qualifiedByName = "idToDistrito")
    @Mapping(target = "economicActivity", source = "economicActivityId", qualifiedByName = "idToEconomicActivity")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    ExternalUser toEntity(ExternalUserModel model);

    @Named("idToProvincia")
    default Provincia idToProvincia(Long id) {
        if (id == null) return null;
        Provincia p = new Provincia();
        p.setId(id);
        return p;
    }

    @Named("idToCanton")
    default Canton idToCanton(Long id) {
        if (id == null) return null;
        Canton c = new Canton();
        c.setId(id);
        return c;
    }

    @Named("idToDistrito")
    default Distrito idToDistrito(Long id) {
        if (id == null) return null;
        Distrito d = new Distrito();
        d.setId(id);
        return d;
    }

    @Named("idToEconomicActivity")
    default EconomicActivity idToEconomicActivity(Long id) {
        if (id == null) return null;
        EconomicActivity e = new EconomicActivity();
        e.setId(id);
        return e;
    }
}
