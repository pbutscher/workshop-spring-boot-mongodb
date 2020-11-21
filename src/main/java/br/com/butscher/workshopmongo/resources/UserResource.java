package br.com.butscher.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.butscher.workshopmongo.domain.User;
import br.com.butscher.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		// User maria = new User("1", "Maria", "maria@maria.com.br");
		// User alex = new User("2", "Alex", "alex@alex.com.br");		
		// List<User> list = new ArrayList<>();
		// list.addAll(Arrays.asList(maria,alex));
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
