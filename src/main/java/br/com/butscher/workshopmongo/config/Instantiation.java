package br.com.butscher.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.butscher.workshopmongo.domain.User;
import br.com.butscher.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();
		
		User maria = new User(null,"maria","maria@gmail.com");
		User alex = new User(null,"alex","alex@gmail.com");
		User bob = new User(null,"bob","bob@gmail.com");
		
		userRepository.save(maria);
		userRepository.save(alex);
		userRepository.save(bob);	
		
	}

}
