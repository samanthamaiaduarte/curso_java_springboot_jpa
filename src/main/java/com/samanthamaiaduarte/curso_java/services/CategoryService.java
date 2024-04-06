package com.samanthamaiaduarte.curso_java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samanthamaiaduarte.curso_java.entities.Category;
import com.samanthamaiaduarte.curso_java.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();		
	}
	
	public Category findById(Long id) {
		return repository.findById(id).get();
	}

}
