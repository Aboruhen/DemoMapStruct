package com.demo.store.mapper;

import com.demo.store.entity.SimpleDetailEntity;
import com.demo.store.external.ExternalProductDetail;
import org.mapstruct.Mapper;

@Mapper
public interface ProductDetailsMapper {

    @ToProductDetail
    SimpleDetailEntity mapSimpleDetails(ExternalProductDetail productDetail);

}
