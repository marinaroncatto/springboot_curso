package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration //classe auxiliar
@Profile("test")//mesmo nome que colocamos na aplication.properties
//adionamos o profile depois da configuration para indicar que ela é específica para o teste
public class TestConfig implements CommandLineRunner{
	
	//injeção de dependência
	@Autowired //associa instancia do repository ao test config
	private UserRepository userRepository;

	//database seeding
	@Override
	public void run(String... args) throws Exception {
		// irá rodar toda vez que iniciar a aplicação
		//função: popular o banco de dados para teste
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
