package com.demo.store.service;

import com.demo.store.dto.ProductView;
import com.demo.store.entity.ProductEntity;
import com.demo.store.mapper.ProductViewMapper;
import com.demo.store.repository.ProductRepository;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private static final ProductViewMapper productViewMapper = Mappers.getMapper(ProductViewMapper.class);

    private final ProductRepository productRepository;

    public List<ProductView> retrieveAllProducts() {
        List<ProductEntity> products = productRepository.products();
        return Collections.singletonList(productViewMapper.mapProduct(products.get(0)));
    }

}
