package com.demo.store.entity;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductEntity implements StoreEntity {

    private UUID id;
    private String shortDescription;
    private BigDecimal price;
    private BigDecimal startPrice;
    private boolean discount;
    private Currency currency;
    private SalePrice salePrice;
    private ProductDetails productDetails;

    @Data
    public static class SalePrice {
        private int percent;
        private int saleStep;
        private BigDecimal lowPrice;
    }

}
