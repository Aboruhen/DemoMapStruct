package com.demo.store.repository;

import com.demo.store.entity.ProductEntity;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Currency;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class ProductRepository {

    /**
     * Dummy products.
     */
    public List<ProductEntity> products() {
        return Collections.singletonList(ProductEntity.builder()
            .currency(Currency.getInstance("USD"))
            .id(UUID.randomUUID())
            .price(BigDecimal.TEN)
            .shortDescription("Test product")
            .build());
    }

}
