package com.samanthamaiaduarte.curso_java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samanthamaiaduarte.curso_java.entities.Product;
import com.samanthamaiaduarte.curso_java.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		return repository.findById(id).get();
	}

}
