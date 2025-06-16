package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service //registra classe no mecanismo de injeção de dependencia
public class UserService {
	
	@Autowired //injeção de dependência
	private UserRepository repository;
	
	//meio de campo entre repository e Resourse
	public List<User> findAll(){
		return repository.findAll(); 
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
