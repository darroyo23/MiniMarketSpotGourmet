package com.spotgourmet.minimarket.pos.infrastructure.mapper;

import com.spotgourmet.minimarket.auth.infrastructure.persistence.mapper.UserMapper;
import com.spotgourmet.minimarket.pos.domain.model.ProductModel;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Category;
import com.spotgourmet.minimarket.pos.infrastructure.entity.Product;
import org.mapstruct.*;



@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ProductMapper {

    @Mapping(target = "categoryId", source = "category.id")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "userToShallowModel")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "userToShallowModel")
    ProductModel toModel(Product entity);

    @Mapping(target = "category", source = "categoryId", qualifiedByName = "idToCategory")
    @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "modelToShallowUser")
    @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "modelToShallowUser")
    Product toEntity(ProductModel model);

    @Named("idToCategory")
    default Category idToCategory(Long id) {
        if (id == null) return null;
        Category c = new Category();
        c.setId(id);
        return c;
    }
}
