package com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper;

import com.spotgourmet.minimarket.auth.domain.model.PermissionModel;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.Permission;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.PermissionGroup;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface PermissionMapper {

    @Mapping(target = "groupId", source = "group.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    PermissionModel toModel(Permission entity);

    @Mapping(target = "group", source = "groupId", qualifiedByName = "idToPermissionGroup")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    Permission toEntity(PermissionModel model);

    @Named("idToPermissionGroup")
    default PermissionGroup idToPermissionGroup(Long id) {
        if (id == null) return null;
        PermissionGroup g = new PermissionGroup();
        g.setId(id);
        return g;
    }
}
