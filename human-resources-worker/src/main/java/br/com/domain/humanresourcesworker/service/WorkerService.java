package br.com.domain.humanresourcesworker.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.domain.humanresourcesworker.model.Worker;
import br.com.domain.humanresourcesworker.repositories.WorkerRepository;

/**
 * Worker service class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@Service
public class WorkerService {
	
	/**
	 * Atribute logger.
	 */
	private static Logger logger = LoggerFactory.getLogger(Worker.class);
	
	@Value("${test.config}")
	private String testConfig;
	
	//private final static String TESTCONFIG = "${test.config}";

	/**
	 * Atribute workerRepository.
	 */
	@Autowired
	private WorkerRepository workerRepository;

	/**
	 * Method responsible for fetching all workers.
	 *
	 * @return - Return all workers.
	 */
	public List<Worker> findAll() {
		return this.workerRepository.findAll();
	}
	
	public void getConfigurations() {
		logger.info("CONFIG: " + testConfig);
	}

	/**
     * Method responsible for fetching a specific worker.
     *
     * @param id - Param id.
     * @return - Return a specific worker.
     * @throws RuntimeException - Exception that can be thrown.
     */
	public Worker findById(Long id) {
		Optional<Worker> optionalWorker = this.workerRepository.findById(id);
		return optionalWorker.orElseThrow(() -> new RuntimeException("Worker not found."));
	}

}
