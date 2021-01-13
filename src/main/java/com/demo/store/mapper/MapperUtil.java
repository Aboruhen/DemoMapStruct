package com.demo.store.mapper;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.mapstruct.Named;

@Named("MappingUtil")
public class MapperUtil {

    @Named("BigDecimalDown")
    public BigDecimal bigDecimalDown(BigDecimal value) {
        return value.setScale(2, RoundingMode.DOWN);
    }

    @Named("BigDecimalHalfUp")
    public BigDecimal bigDecimalHalfUp(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP);
    }

}
