package com.demo.store.mapper;

import com.demo.store.entity.ProductType;
import com.demo.store.external.ExternalMobileProduct.ExternalProductType;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;

@Mapper
public interface ProductTypeMapper {

    @ValueMapping(source = "HEADPHONES", target = "ELECTRONIC")
    @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "UNDEFINED")
    ProductType mapTypes(ExternalProductType externalProductType);

}
