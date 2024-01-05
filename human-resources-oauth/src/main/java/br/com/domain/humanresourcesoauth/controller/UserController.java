package br.com.domain.humanresourcesoauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.domain.humanresourcesoauth.model.User;
import br.com.domain.humanresourcesoauth.services.UserService;

/**
 * User controller class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

	/**
	 * Atribute userService.
	 */
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findUserByEmail(@RequestParam String email) {
		try {
			return ResponseEntity.ok(this.userService.getUserByEmail(email));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
}
