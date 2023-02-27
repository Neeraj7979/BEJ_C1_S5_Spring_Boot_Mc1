package com.niit.bej.c1_s5_spring_boot_Mc1.service;

import com.niit.bej.c1_s5_spring_boot_Mc1.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProduct();

    Product addProduct(Product product);
}
