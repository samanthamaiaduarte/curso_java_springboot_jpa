package com.samanthamaiaduarte.curso_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samanthamaiaduarte.curso_java.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
