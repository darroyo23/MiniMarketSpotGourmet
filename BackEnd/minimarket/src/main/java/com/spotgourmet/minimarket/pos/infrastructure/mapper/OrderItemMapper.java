package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper.UserMapper;
import com.spotgourmet.minimarket.pos.domain.model.OrderItemModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Order;
import com.spotgourmet.minimarket.pos.infrastructure.entity.OrderItem;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Product;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface OrderItemMapper {

    @Mapping(target = "orderId", source = "order.id")
    @Mapping(target = "productId", source = "product.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    OrderItemModel toModel(OrderItem entity);

    @Mapping(target = "order", source = "orderId", qualifiedByName = "idToOrder")
    @Mapping(target = "product", source = "productId", qualifiedByName = "idToProduct")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    OrderItem toEntity(OrderItemModel model);

    @Named("idToOrder")
    default Order idToOrder(Long id) {
        if (id == null) return null;
        Order o = new Order();
        o.setId(id);
        return o;
    }

    @Named("idToProduct")
    default Product idToProduct(Long id) {
        if (id == null) return null;
        Product p = new Product();
        p.setId(id);
        return p;
    }
}
