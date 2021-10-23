package com.test.springbootcrud.controller;

import com.test.springbootcrud.model.Product;
import com.test.springbootcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    @Qualifier("CustomizeRestTemplate")
    private RestTemplate customizeRest;

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);

    }
    @PostMapping("/productList")
    public List<Product> productList(@RequestBody List<Product> products){
        return productService.saveProductList(products);

    }
    @GetMapping
    public List<Product> showProduct(){
        return productService.getProducts();

    }
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id){
        return productService.getProductById(id);

    }
    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable String name){
        return productService.getProductByName(name);

    }
//    @GetMapping("/productByPrice/{price}")
//    public Product findProductByPrice(@PathVariable double price){
//        System.out.print("Price--->"+price);
//        return productService.getProductByPrice(price);
//
//    }

    @PutMapping("{id}")
    public Product updateProduct(@PathVariable ("id") int id,@RequestBody Product product){
        return productService.updateProduct(id,product);


    }
    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);

    }



}
