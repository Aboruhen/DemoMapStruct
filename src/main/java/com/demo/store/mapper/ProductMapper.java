package com.demo.store.mapper;

import com.demo.store.entity.ProductEntity;
import com.demo.store.external.ExternalMobileProduct;
import java.util.UUID;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = MapperUtil.class)
public interface ProductMapper {

    @Mapping(target = "salePrice.percent", source = "sale.percent")
    @Mapping(target = "salePrice.saleStep", source = "sale.saleStep")
    @Mapping(target = "salePrice.lowPrice", source = "sale.lowPrice", qualifiedByName = {"MappingUtil", "BigDecimalDown"})
    @Mapping(target = "price", source = "price.price")
    @Mapping(target = "startPrice", source = "price.startPrice", qualifiedByName = {"MappingUtil", "BigDecimalHalfUp"})
    @Mapping(target = "currency",
        expression = "java(java.util.Currency.getInstance(mobileProduct.getCurrency().getCode()))")
    ProductEntity baseMapProduct(ExternalMobileProduct mobileProduct);

    default UUID mapToUUID(long id) {
        return UUID.fromString(String.valueOf(id));
    }

}
