package com.virtusa.travelline.dao;

import java.util.List;

import com.virtusa.travelline.model.Feedback;
import com.virtusa.travelline.model.Passenger;

public interface FeedbackDAO {
	public void addFeedback(Feedback feedback);
	public List<Feedback> getAllFeedback();

}
