package com.virtusa.travelline.dao;

import java.util.List;

import com.virtusa.travelline.model.Payment;


public interface PaymentDAO {
	public void addPayment(Payment payment);
	public List<Payment> getAllPayment();
}
