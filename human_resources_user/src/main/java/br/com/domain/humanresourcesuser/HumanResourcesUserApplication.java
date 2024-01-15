package br.com.domain.humanresourcesuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import br.com.domain.humanresourcesuser.service.UserService;

@EnableEurekaClient
@SpringBootApplication
public class HumanResourcesUserApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(HumanResourcesUserApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//this.userService.convertPasswordToBCryptPasswordEncoder("123456");
	}

}
