package com.demo.store.external;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ExternalMobileProduct {

    private long id;
    private ExternalProductType type;
    private ExternalCurrency currency;
    private ExternalPrice price;
    private Sale sale;

    public enum ExternalProductType {
        MOBILE,
        HEADPHONES,
        OTHERS;

    }

    @Data
    public static class Sale {
        private int percent;
        private int saleStep;
        private BigDecimal lowPrice;
    }

    @Data
    public static class ExternalCurrency {
        private String code;
    }

    @Data
    public static class ExternalPrice {
        private String price;
        private BigDecimal startPrice;
        private String currencyCode;
    }

}
