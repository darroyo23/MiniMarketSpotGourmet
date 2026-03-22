package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper.UserMapper;
import com.spotgourmet.minimarket.pos.domain.model.ClosedDayModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.ClosedDay;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ClosedDayMapper {

    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    ClosedDayModel toModel(ClosedDay entity);

    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    ClosedDay toEntity(ClosedDayModel model);
}
