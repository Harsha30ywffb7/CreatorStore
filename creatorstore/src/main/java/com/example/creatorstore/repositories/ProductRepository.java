package com.example.creatorstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.creatorstore.entities.Product;


// need to extend repo for the ORM flexibility.
// doubt: but how it works and use of it writing here.

public interface ProductRepository  extends JpaRepository<Product, Long>{
    // used here class name of the entity and primary type used for that entity table
    
} 
