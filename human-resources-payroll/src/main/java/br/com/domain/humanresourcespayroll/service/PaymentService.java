package br.com.domain.humanresourcespayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.domain.humanresourcespayroll.feignclients.WorkerFeignClient;
import br.com.domain.humanresourcespayroll.model.Payment;
import br.com.domain.humanresourcespayroll.model.Worker;

/**
 * Payment service class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;

	/**
	 * Method responsible for returning the payroll of a specific worker.
	 * 
	 * @param workerId - Worker id parameter.
	 * @param days     - Number of days worked.
	 * @return - Return the payroll of a worker.
	 */
	public Payment getPayment(Long workerId, Integer days) {
		Worker worker = this.workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
