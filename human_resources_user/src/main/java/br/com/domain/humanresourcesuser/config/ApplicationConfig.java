package br.com.domain.humanresourcesuser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Application config class.
 * 
 * @author Eduardo Isidoro Gonçalves.
 */
@Configuration
public class ApplicationConfig {
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
