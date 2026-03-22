package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper.UserMapper;
import com.spotgourmet.minimarket.pos.domain.model.OrderModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Order;
import com.spotgourmet.minimarket.auth.infrastructure.persistence.entity.UserEntity;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface OrderMapper {

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    OrderModel toModel(Order entity);

    @Mapping(target = "user", source = "userId", qualifiedByName = "idToUserEntity")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    Order toEntity(OrderModel model);

    @Named("idToUserEntity")
    default UserEntity idToUserEntity(Long id) {
        if (id == null) return null;
        UserEntity u = new UserEntity();
        u.setId(id);
        return u;
    }
}
