package com.virtusa.travelline.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Passenger;

@Controller
public class SeatDetailsController {
	@RequestMapping(value = "/saveseats", method = RequestMethod.POST)
	public ModelAndView saveSeat(@RequestParam(value="myArray[]") Integer[] myArray) {
		
		
		AccountHolder accountholder=new AccountHolder();
		
		return new ModelAndView("passengerDetailsForm","accountholder", accountholder);

	}
	
		@RequestMapping(value = "/saveseats", method = RequestMethod.GET)
		public ModelAndView addFeedback(HttpSession session) {
			
			AccountHolder accountholder=(AccountHolder) session.getAttribute("AccountHolder");
			if(accountholder==null) {
				return new ModelAndView("loginprompt");
			}
			else {
			List<Passenger> pas=new ArrayList<Passenger>();
			accountholder.setPassenger(pas);
			System.out.println(accountholder);
			ModelAndView model= new ModelAndView();
			model.addObject("accountholder",accountholder);
		
			model.setViewName("passengerDetailsForm");
			return model;
			
			
			
		}

	

}
}
