package com.example.creatorstore.services;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.stereotype.Service;

import com.example.creatorstore.entities.Product;
import com.example.creatorstore.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
// this is most important to say it as a service

public class ProductService {
    private final ProductRepository productRepository;
       public Product createProduct(Product product){
        return productRepository.save(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(Long id,Product product){
        Product existingProduct = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with the id "+id));

        // done using it by getters and setters from the lombork library
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setStockQuantity(product.getStockQuantity());
 
        return productRepository.save(existingProduct);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById( Long id){
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with the id " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(Long id){
       productRepository.deleteById(id);
    }
}
