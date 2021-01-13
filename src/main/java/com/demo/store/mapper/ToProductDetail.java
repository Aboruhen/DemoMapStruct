package com.demo.store.mapper;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.mapstruct.Mapping;

@Retention(RetentionPolicy.CLASS)
@Mapping(target = "creationDate", expression = "java(java.time.Instant.now())")
@Mapping(target = "details", source = "details")
public @interface ToProductDetail {

}
