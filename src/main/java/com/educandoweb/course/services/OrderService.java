package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service //registra classe no mecanismo de injeção de dependencia
public class OrderService {
	
	@Autowired //injeção de dependência
	private OrderRepository repository;
	
	//meio de campo entre repository e Resourse
	public List<Order> findAll(){
		return repository.findAll(); 
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
