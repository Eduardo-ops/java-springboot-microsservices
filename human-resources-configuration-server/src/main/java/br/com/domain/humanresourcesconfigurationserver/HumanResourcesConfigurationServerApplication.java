package br.com.domain.humanresourcesconfigurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HumanResourcesConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanResourcesConfigurationServerApplication.class, args);
	}

}
