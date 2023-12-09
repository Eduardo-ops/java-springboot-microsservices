package br.com.domain.humanresourcesuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.domain.humanresourcesuser.model.User;
import br.com.domain.humanresourcesuser.repositories.UserRepository;

/**
 * User controller class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	/**
	 * Atribute user repository.
	 */
	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		return ResponseEntity.ok(this.userRepository.findById(id).get());
	}
	
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		return ResponseEntity.ok(this.userRepository.findByEmail(email));
	}
}
