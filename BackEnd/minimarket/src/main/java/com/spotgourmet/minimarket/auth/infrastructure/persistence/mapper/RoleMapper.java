package com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper;

import com.spotgourmet.minimarket.auth.domain.model.RoleModel;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface RoleMapper {

    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    RoleModel toModel(Role entity);

    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    Role toEntity(RoleModel model);
}
