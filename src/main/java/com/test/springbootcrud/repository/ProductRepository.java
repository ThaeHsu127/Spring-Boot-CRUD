package com.test.springbootcrud.repository;

import com.test.springbootcrud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
