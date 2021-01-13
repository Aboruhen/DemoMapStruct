package com.demo.store.entity;

import java.time.Instant;
import lombok.Data;

@Data
public class SimpleDetailEntity {

    private Instant creationDate;
    private String description;
    private String details;

}
