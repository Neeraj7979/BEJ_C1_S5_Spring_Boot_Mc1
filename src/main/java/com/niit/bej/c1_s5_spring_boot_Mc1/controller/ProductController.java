package com.niit.bej.c1_s5_spring_boot_Mc1.controller;

import com.niit.bej.c1_s5_spring_boot_Mc1.domain.Product;
import com.niit.bej.c1_s5_spring_boot_Mc1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAllProduct")
    public ResponseEntity<?> getAllProduct() {
        List<Product> productList = productService.getAllProduct();
        if (productList.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(productList, HttpStatus.FOUND);
    }

    @PostMapping("/saveProduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product product) {
        Product addProduct = productService.addProduct(product);
        if (addProduct != null) return new ResponseEntity<>(addProduct, HttpStatus.CREATED);
        else return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }
}
