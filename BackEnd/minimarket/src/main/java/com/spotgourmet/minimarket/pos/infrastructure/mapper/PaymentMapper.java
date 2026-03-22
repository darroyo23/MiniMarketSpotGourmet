package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper.UserMapper;
import com.spotgourmet.minimarket.pos.domain.model.PaymentModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Order;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Payment;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface PaymentMapper {

    @Mapping(target = "orderId", source = "order.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    PaymentModel toModel(Payment entity);

    @Mapping(target = "order", source = "orderId", qualifiedByName = "idToOrder")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    Payment toEntity(PaymentModel model);

    @Named("idToOrder")
    default Order idToOrder(Long id) {
        if (id == null) return null;
        Order o = new Order();
        o.setId(id);
        return o;
    }
}
