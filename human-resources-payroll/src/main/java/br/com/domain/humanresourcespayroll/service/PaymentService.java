package br.com.domain.humanresourcespayroll.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.domain.humanresourcespayroll.model.Payment;
import br.com.domain.humanresourcespayroll.model.Worker;

/**
 * Payment service class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@Service
public class PaymentService {

	/**
	 * Atribute workerHost - Responsible for storing the communication host of
	 * another microsservice.
	 */
	@Value("${human_resources_payroll.host}")
	private String workerHost;

	/**
	 * Atribute restTemplate.
	 */
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Method responsible for returning the payroll of a specific worker.
	 * 
	 * @param workerId - Worker id parameter.
	 * @param days     - Number of days worked.
	 * @return - Return the payroll of a worker.
	 */
	public Payment getPayment(Long workerId, Integer days) {
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("id", "" + workerId);

		Worker worker = this.restTemplate.getForObject(this.workerHost + "/workers/{id}", Worker.class, uriVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
