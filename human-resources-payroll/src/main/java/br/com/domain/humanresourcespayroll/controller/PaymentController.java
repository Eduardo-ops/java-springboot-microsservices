package br.com.domain.humanresourcespayroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.domain.humanresourcespayroll.model.Payment;
import br.com.domain.humanresourcespayroll.service.PaymentService;

/**
 * Payment controller class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

	/**
	 * Atribute paymentService.
	 */
	@Autowired
	private PaymentService paymentService;

	/**
	 * Method responsible for fetching a specific payment.
	 *
	 * @param workerId - Param workerId.
	 * @param days     - Param days.
	 * @return - Return a specific payment.
	 */
	@HystrixCommand(fallbackMethod = "getPaymentAlternative")
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		return ResponseEntity.ok(this.paymentService.getPayment(workerId, days));
	}

	/**
	 * Method alternative and responsible for fetching a specific payment.
	 *
	 * @param workerId - Param workerId.
	 * @param days     - Param days.
	 * @return - Return a specific payment.
	 */
	public ResponseEntity<Payment> getPaymentAlternative(Long workerId, Integer days) {
		return ResponseEntity.ok(new Payment("Brann", 400.0, days));
	}

}
