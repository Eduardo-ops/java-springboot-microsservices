package br.com.domain.humanresourcespayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.domain.humanresourcespayroll.model.Worker;

/**
 * Interface responsible for estabilishing communication with the microservice
 * human-resources-worker.
 */
@Component
@FeignClient(name = "human-resources-worker", path = "/workers")
public interface WorkerFeignClient {

	/**
	 * Method reponsible for get a specific worker.
	 */
	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);

}
