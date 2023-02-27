package com.niit.bej.c1_s5_spring_boot_Mc1;

import com.niit.bej.c1_s5_spring_boot_Mc1.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
