package com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper;

import com.spotgourmet.minimarket.auth.domain.model.UserRoleModel;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.Role;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserEntity;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserRole;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface UserRoleMapper {

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "roleId", source = "role.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    UserRoleModel toModel(UserRole entity);

    @Mapping(target = "user", source = "userId", qualifiedByName = "idToUserEntity")
    @Mapping(target = "role", source = "roleId", qualifiedByName = "idToRole")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    UserRole toEntity(UserRoleModel model);

    @Named("idToUserEntity")
    default UserEntity idToUserEntity(Long id) {
        if (id == null) return null;
        UserEntity u = new UserEntity();
        u.setId(id);
        return u;
    }

    @Named("idToRole")
    default Role idToRole(Long id) {
        if (id == null) return null;
        Role r = new Role();
        r.setId(id);
        return r;
    }
}
