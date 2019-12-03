package com.virtusa.travelline.service;

import java.util.List;

import com.virtusa.travelline.model.Payment;

public interface PaymentService {
	
	
	public List<Payment> getAllPayment();
	
	public void addPayment(Payment payment);

	
}
