package com.test.springBootCRUD.service;

import com.test.springBootCRUD.exception.ResourceNotFoundException;
import com.test.springBootCRUD.model.Product;
import com.test.springBootCRUD.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);

    }

    public List<Product> saveProductList(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }


    public Product getProductById(int id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not exist with id:" + id));
    }

    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public Product updateProduct(int id, Product product) {
        Product existProduct = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not exist with id:" + id));

        existProduct.setName(product.getName());
        existProduct.setQuantity(product.getQuantity());
        existProduct.setPrice(product.getPrice());
        return productRepository.save(existProduct);
    }

    public String deleteProduct(int id) {
        Product deleteProduct = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not exist with id:" + id));
        productRepository.delete(deleteProduct);
        return "Product Remove "+ id;

    }

//    public String deleteProduct(int id) {
//        productRepository.deleteById(id);
//        return "Product Remove "+ id;
//    }
}
