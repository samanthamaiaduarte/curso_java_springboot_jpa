package com.samanthamaiaduarte.curso_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samanthamaiaduarte.curso_java.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
