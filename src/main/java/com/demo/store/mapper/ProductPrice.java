package com.demo.store.mapper;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

@Named("PriceRound")
@Component
public class ProductPrice {

    @Named("priceRoundHalfUp")
    public BigDecimal bigDecimalRoundHalfUp(BigDecimal sourcePrice) {
        return sourcePrice.setScale(2, RoundingMode.HALF_UP);
    }

}
