package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	//responsável por fazer operações com a entidade Order
	//no banco de dados
	
	//mesmo sendo uma interface não precisamos implementa-la manualmente
	//pois o JpaRepository faz isso automaticamente
}
