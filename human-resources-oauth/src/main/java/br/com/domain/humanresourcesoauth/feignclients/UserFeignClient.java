package br.com.domain.humanresourcesoauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.domain.humanresourcesoauth.model.User;

/**
 * Interface responsible for estabilishing communication with the microservice
 * human-resources-user.
 */
@Component
@FeignClient(name = "human-resources-user", path = "/users")
public interface UserFeignClient {

	/**
	 * Method reponsible for get a specific user for the email.
	 */
	@GetMapping(value = "/search")
	ResponseEntity<User> findByEmail(@RequestParam String email);
}
