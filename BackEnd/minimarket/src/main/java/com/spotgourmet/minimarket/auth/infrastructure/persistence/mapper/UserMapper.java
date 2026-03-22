package com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper;

import com.spotgourmet.minimarket.auth.domain.model.UserModel;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {

    // ─── Entity → Domain (completo, 1 nivel de profundidad) ────────────────────

    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    UserModel toModel(UserEntity entity);

    // ─── Domain → Entity ────────────────────────────────────────────────────────

    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    UserEntity toEntity(UserModel model);

    // ─── Shallow: 1 nivel, sin audit fields (corta la recursión) ────────────────

    @Named("userToShallowModel")
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "updatedBy", ignore = true)
    UserModel toShallowModel(UserEntity entity);

    @Named("modelToShallowUser")
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "updatedBy", ignore = true)
    UserEntity toShallowEntity(UserModel model);
}
