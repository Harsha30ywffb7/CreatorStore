package com.example.creatorstore.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.creatorstore.entities.Product;
import com.example.creatorstore.services.ProductService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
// after adding this annotation, this class can be used to handle the REST api's.
@RequestMapping("/api/products")
// these api's are available under this path, as same as the routes we use in the express as app.use("/v1/products")

@RequiredArgsConstructor
// what is the use of it, i didn't got it!!
// got it , we get here required all methods of a class and create a constructor.
// private final ProductService productService; like it




public class ProductController {


    private final ProductService productService;
    @PostMapping
    // type of rest api
    // and using the @valid and @requestbody annotations payload in the requestbody validates with the entity.
    public Product createProduct(@Valid @RequestBody Product product){
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,@Valid @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id){
       productService.deleteProductById(id);
    }


}
