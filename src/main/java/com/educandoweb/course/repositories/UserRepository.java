package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	//responsável por fazer operações com a entidade User
	//no banco de dados
	
	//mesmo sendo uma interface não precisamos implementa-la manualmente
	//pois o JpaRepository faz isso automaticamente
}
