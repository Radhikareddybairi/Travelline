package com.virtusa.travelline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.travelline.dao.FeedbackDAO;
import com.virtusa.travelline.dao.PassengerDAO;
import com.virtusa.travelline.model.Feedback;

@Service
@Transactional
public class FeedbackServiceImpl implements FeedbackService{
	public FeedbackServiceImpl()
	{
		super();
	}
	@Autowired
	private FeedbackDAO feedbackDAO;

	@Override
	@Transactional
	public void addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		feedbackDAO.addFeedback(feedback);

		
	}

	@Override
	@Transactional
	public List<Feedback> getAllFeedback() {

		return feedbackDAO.getAllFeedback();

	}

}
