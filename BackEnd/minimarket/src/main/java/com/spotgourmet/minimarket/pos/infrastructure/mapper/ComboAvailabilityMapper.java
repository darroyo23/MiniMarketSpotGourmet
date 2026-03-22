package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper.UserMapper;
import com.spotgourmet.minimarket.pos.domain.model.ComboAvailabilityModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Combo;
import com.spotgourmet.minimarket.pos.infrastructure.entity.ComboAvailability;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ComboAvailabilityMapper {

    @Mapping(target = "comboId", source = "combo.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    ComboAvailabilityModel toModel(ComboAvailability entity);

    @Mapping(target = "combo", source = "comboId", qualifiedByName = "idToCombo")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    ComboAvailability toEntity(ComboAvailabilityModel model);

    @Named("idToCombo")
    default Combo idToCombo(Long id) {
        if (id == null) return null;
        Combo c = new Combo();
        c.setId(id);
        return c;
    }
}
