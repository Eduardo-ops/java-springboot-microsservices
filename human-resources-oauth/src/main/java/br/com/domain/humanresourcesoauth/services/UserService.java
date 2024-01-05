package br.com.domain.humanresourcesoauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.domain.humanresourcesoauth.feignclients.UserFeignClient;
import br.com.domain.humanresourcesoauth.model.User;

/**
 * User service class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@Service
public class UserService {

	@Autowired
	private UserFeignClient userFeignClient;

	/**
	 * Method responsible for returning a specific user by email.
	 * 
	 * @param email - User email parameter.
	 * @return - Return the user by email.
	 */
	public User getUserByEmail(String email) {
		User user = this.userFeignClient.findByEmail(email).getBody();

		if (user == null) {
			throw new IllegalArgumentException("Email not found");
		}

		return user;
	}
}
