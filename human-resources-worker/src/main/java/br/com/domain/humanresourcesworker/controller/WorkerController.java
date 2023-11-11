package br.com.domain.humanresourcesworker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.domain.humanresourcesworker.model.Worker;
import br.com.domain.humanresourcesworker.service.WorkerService;

/**
 * Worker controller class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
	
	/**
	 * Atribute logger.
	 */
	private static Logger logger = LoggerFactory.getLogger(Worker.class);
	
	/**
	 * Atribute environment.
	 */
	@Autowired
	private Environment environment;

	/**
	 * Atribute workerService.
	 */
	@Autowired
	private WorkerService workerService;

	/**
	 * Method responsible for fetching all workers.
	 *
	 * @return - Return all workers.
	 */
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		return ResponseEntity.ok().body(this.workerService.findAll());
	}
	
	@GetMapping(value = "/configurations")
	public ResponseEntity<Void> getConfigurations() {
		this.workerService.getConfigurations();
		return ResponseEntity.noContent().build();
	}

	/**
	 * Method responsible for fetching a specific worker.
	 *
	 * @param id - Param id.
	 * @return - Return a specific worker.
	 */
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		// Imprimi no log o número da porta quee está sendo executado o serviço.
		logger.info("PORT: " + environment.getProperty("local.server.port"));
		
		return ResponseEntity.ok().body(this.workerService.findById(id));
	}
}
