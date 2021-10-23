package com.test.springBootCRUD.repository;

import com.test.springBootCRUD.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
