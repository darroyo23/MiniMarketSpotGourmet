package com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper;

import com.spotgourmet.minimarket.auth.domain.model.RolePermissionModel;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.Permission;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.Role;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.RolePermission;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface RolePermissionMapper {

    @Mapping(target = "roleId", source = "role.id")
    @Mapping(target = "permissionId", source = "permission.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    RolePermissionModel toModel(RolePermission entity);

    @Mapping(target = "role", source = "roleId", qualifiedByName = "idToRole")
    @Mapping(target = "permission", source = "permissionId", qualifiedByName = "idToPermission")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    RolePermission toEntity(RolePermissionModel model);

    @Named("idToRole")
    default Role idToRole(Long id) {
        if (id == null) return null;
        Role r = new Role();
        r.setId(id);
        return r;
    }

    @Named("idToPermission")
    default Permission idToPermission(Long id) {
        if (id == null) return null;
        Permission p = new Permission();
        p.setId(id);
        return p;
    }
}
