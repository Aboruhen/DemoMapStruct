package com.demo.store.mapper;

import com.demo.store.dto.ProductView;
import com.demo.store.entity.ProductEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.MappingTarget;

@Mapper(config = ProductConfigMapper.class, mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface ProductViewMapper {

    @InheritConfiguration(name = "baseMapProduct")
    ProductView mapProduct(ProductEntity productEntity);

    @InheritInverseConfiguration(name = "baseMapProduct")
    ProductEntity mapProduct(ProductView productView);

    @InheritConfiguration(name = "mapProduct")
    void updateProductFromEntity(ProductEntity productEntity, @MappingTarget ProductView productView);

}
