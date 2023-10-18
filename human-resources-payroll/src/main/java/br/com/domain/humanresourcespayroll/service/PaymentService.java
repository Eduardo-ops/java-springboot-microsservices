package br.com.domain.humanresourcespayroll.service;

import org.springframework.stereotype.Service;

import br.com.domain.humanresourcespayroll.model.Payment;

/**
 * Payment service class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@Service
public class PaymentService {

	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("João", 200.0, days);
	}

}
