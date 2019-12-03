package com.virtusa.travelline.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.travelline.model.Payment;
@Repository
public class PaymentDAOImpl implements PaymentDAO {
	public PaymentDAOImpl() {
		super();
	}
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addPayment(Payment payment) {


		
		sessionFactory.getCurrentSession().saveOrUpdate(payment);
		
	}
		
	

	@Override
	@SuppressWarnings("unchecked")
	public List<Payment> getAllPayment() {


		
		return sessionFactory.getCurrentSession().createQuery("from Passenger").list();
		
	
	}

}

