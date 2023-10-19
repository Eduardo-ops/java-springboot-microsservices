package br.com.domain.humanresourcespayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Application config class.
 * 
 * @author Eduardo Isidoro Gonçalves.
 */
@Configuration
public class ApplicationConfig {

	/**
	 * Method responsible for generating a restTemplate for communication between
	 * microsservices.
	 * 
	 * @return Return a restTemplate for communication.
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
