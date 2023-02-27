package com.niit.bej.c1_s5_spring_boot_Mc1.service;

import com.niit.bej.c1_s5_spring_boot_Mc1.domain.Product;
import com.niit.bej.c1_s5_spring_boot_Mc1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
