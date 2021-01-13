package com.demo.store.mapper;

import com.demo.store.dto.ProductView;
import com.demo.store.entity.ProductEntity;
import java.math.BigDecimal;
import java.util.Objects;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

@MapperConfig(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductConfigMapper {

    @Mapping(source = "discount", target = "sales")
    ProductView baseMapProduct(ProductEntity productEntity);

    @Named("salesCheck")
    default Boolean onSale(BigDecimal source) {
        return Objects.nonNull(source) && source.compareTo(BigDecimal.ZERO) >= 0;
    }

}
