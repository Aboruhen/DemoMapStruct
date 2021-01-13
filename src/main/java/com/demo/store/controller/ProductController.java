package com.demo.store.controller;

import com.demo.store.dto.ProductView;
import com.demo.store.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("products")
    public List<ProductView> products() {
        return productService.retrieveAllProducts();
    }

}
