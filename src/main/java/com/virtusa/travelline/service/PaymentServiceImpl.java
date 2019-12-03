package com.virtusa.travelline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.travelline.dao.PaymentDAO;
import com.virtusa.travelline.model.Payment;
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
	public PaymentServiceImpl() {
		super();
	}
@Autowired
private PaymentDAO paymentDAO;

	
	
	@Override

	@Transactional
	public List<Payment> getAllPayment() {
		return paymentDAO.getAllPayment();
	}
	@Transactional

	@Override
	public void addPayment(Payment payment) {
	paymentDAO.addPayment(payment);
		
	}
	


}
