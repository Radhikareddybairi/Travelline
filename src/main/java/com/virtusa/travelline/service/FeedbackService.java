package com.virtusa.travelline.service;

import java.util.List;

import com.virtusa.travelline.model.Feedback;

public interface FeedbackService {
	public void addFeedback(Feedback feedback);
	public List<Feedback> getAllFeedback();

}
