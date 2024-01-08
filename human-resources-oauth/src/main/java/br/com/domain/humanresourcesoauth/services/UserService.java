package br.com.domain.humanresourcesoauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.domain.humanresourcesoauth.feignclients.UserFeignClient;
import br.com.domain.humanresourcesoauth.model.User;

/**
 * User service class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserFeignClient userFeignClient;

	/**
	 * Method responsible for returning a specific user by email.
	 * Didatic demonstration only.
	 * 
	 * If were to leave just one method, the spring security
	 * method would be below.
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
	
	//Recommended method.
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = this.userFeignClient.findByEmail(username).getBody();
		
		if (user == null) {
			throw new UsernameNotFoundException("Email not found");
		}
		
		return user;
	}
}
