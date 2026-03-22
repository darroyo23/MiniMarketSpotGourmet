package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper.UserMapper;
import com.spotgourmet.minimarket.pos.domain.model.ComboItemModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Combo;
import com.spotgourmet.minimarket.pos.infrastructure.entity.ComboItem;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Product;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ComboItemMapper {

    @Mapping(target = "comboId", source = "combo.id")
    @Mapping(target = "productId", source = "product.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    ComboItemModel toModel(ComboItem entity);

    @Mapping(target = "combo", source = "comboId", qualifiedByName = "idToCombo")
    @Mapping(target = "product", source = "productId", qualifiedByName = "idToProduct")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    ComboItem toEntity(ComboItemModel model);

    @Named("idToCombo")
    default Combo idToCombo(Long id) {
        if (id == null) return null;
        Combo c = new Combo();
        c.setId(id);
        return c;
    }

    @Named("idToProduct")
    default Product idToProduct(Long id) {
        if (id == null) return null;
        Product p = new Product();
        p.setId(id);
        return p;
    }
}
