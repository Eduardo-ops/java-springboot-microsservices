package br.com.domain.humanresourcesworker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	/**
	 * Method responsible for fetching a specific worker.
	 *
	 * @param id - Param id.
	 * @return - Return a specific worker.
	 */
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(this.workerService.findById(id));
	}
}
