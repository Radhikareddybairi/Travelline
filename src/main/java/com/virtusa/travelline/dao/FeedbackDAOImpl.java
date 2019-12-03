package com.virtusa.travelline.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.travelline.model.Feedback;

@Repository
public class FeedbackDAOImpl implements FeedbackDAO{
	public FeedbackDAOImpl() {
		super();
	}
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addFeedback(Feedback feedback) {
		
	
		sessionFactory.getCurrentSession().saveOrUpdate(feedback);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Feedback> getAllFeedback() {
		
	
		
		
		return sessionFactory.getCurrentSession().createQuery("from Feedback").list();
	}

}
