package br.com.domain.humanresourcespayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "human-resources-worker")
@EnableFeignClients
@SpringBootApplication
public class HumanResourcesPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanResourcesPayrollApplication.class, args);
	}

}
