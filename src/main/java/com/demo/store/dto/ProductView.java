package com.demo.store.dto;

import com.demo.store.entity.ProductDetails;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductView implements EntityDto {

    private UUID id;
    private String shortDescription;
    private BigDecimal price;
    private boolean sales;
    private Currency currency;
    private ProductDetails productDetails;

}
