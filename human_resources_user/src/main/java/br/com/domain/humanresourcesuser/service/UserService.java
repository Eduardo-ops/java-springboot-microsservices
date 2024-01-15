/**
 * 
 */
package br.com.domain.humanresourcesuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class UserService {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public void convertPasswordToBCryptPasswordEncoder(String password) {
		System.out.println("BCRYPTP: " + this.bCryptPasswordEncoder.encode(password));
	}
}
