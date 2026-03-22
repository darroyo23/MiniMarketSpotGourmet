package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper.UserMapper;
import com.spotgourmet.minimarket.pos.domain.model.CheckoutCounterSessionModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.CheckoutCounterSession;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserEntity;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface CheckoutCounterSessionMapper {

    @Mapping(target = "cashierId", source = "cashier.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    CheckoutCounterSessionModel toModel(CheckoutCounterSession entity);

    @Mapping(target = "cashier", source = "cashierId", qualifiedByName = "idToUserEntity")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    CheckoutCounterSession toEntity(CheckoutCounterSessionModel model);

    @Named("idToUserEntity")
    default UserEntity idToUserEntity(Long id) {
        if (id == null) return null;
        UserEntity u = new UserEntity();
        u.setId(id);
        return u;
    }
}
