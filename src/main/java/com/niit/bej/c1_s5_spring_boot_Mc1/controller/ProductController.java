package com.niit.bej.c1_s5_spring_boot_Mc1.controller;

import com.niit.bej.c1_s5_spring_boot_Mc1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
}
