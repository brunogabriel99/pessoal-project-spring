package com.pessoalproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoalproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
