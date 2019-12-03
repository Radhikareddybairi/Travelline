package com.virtusa.travelline.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.travelline.model.Feedback;


import com.virtusa.travelline.service.FeedbackService;

@Controller
public class FeedbackController {
	@Autowired
	private FeedbackService  feedbackService;

	@RequestMapping(value ="/viewFeedback",method=RequestMethod.GET)
	public ModelAndView listFeedback(ModelAndView model) throws IOException {
		List<Feedback> listFeedback = feedbackService.getAllFeedback();
		model.addObject("listFeedback", listFeedback);
		model.setViewName("viewFeedbackDetails");
		return model;
	}

	@RequestMapping(value = "/addFeedback", method = RequestMethod.POST)
	public ModelAndView addFeedback(HttpServletRequest request,ModelAndView model) {
		String name=request.getParameter("pName");
		String mailId=request.getParameter("emailId");
		String comments=request.getParameter("comments");
		
		Feedback feedback = new Feedback();
		feedback.setPassengerName(name);
		feedback.setEmailId(mailId);
		feedback.setComments(comments);
		feedbackService.addFeedback(feedback);
		model.setViewName("redirect:/");
		return model;
	
				
	}

	

}
