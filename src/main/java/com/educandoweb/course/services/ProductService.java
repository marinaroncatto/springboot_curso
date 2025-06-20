package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service //registra classe no mecanismo de injeção de dependencia
public class ProductService {
	
	@Autowired //injeção de dependência
	private ProductRepository repository;
	
	//meio de campo entre repository e Resourse
	public List<Product> findAll(){
		return repository.findAll(); 
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
