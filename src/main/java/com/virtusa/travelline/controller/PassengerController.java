package com.virtusa.travelline.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Passenger;
import com.virtusa.travelline.model.Service;
import com.virtusa.travelline.model.TicketDetails;
import com.virtusa.travelline.service.PassengerService;
import com.virtusa.travelline.service.TicketDetailsService;

@Controller
public class PassengerController {
	@Autowired
	private PassengerService passengerService;


	@RequestMapping(value = "/viewPassenger",method=RequestMethod.GET)
	public ModelAndView listPassenger(ModelAndView model) throws IOException {
		List<Passenger> listPassenger = passengerService.getAllPassenger();
		model.addObject("listPassenger", listPassenger);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value = "/addPassenger", method = RequestMethod.GET)
	public ModelAndView addPassenger(ModelAndView model) {
		Passenger passenger = new Passenger();
		model.addObject("passenger", passenger);
		model.setViewName("passengerForm");
		return model;
	}

	/*@RequestMapping(value="/savePassenger",method = RequestMethod.POST)
	public void saveTicket(@ModelAttribute AccountHolder accountholder,HttpSession session) {
		List<Passenger> pas=accountholder.getPassenger();
		
		
			
			
			passengerService.addPassenger(pas);

		System.out.println(pas);
	}*/

	@RequestMapping(value = "/deletePssenger", method = RequestMethod.GET)
	public ModelAndView deletePassenger(HttpServletRequest request) {
		int passengerId = Integer.parseInt(request.getParameter("passenegrId"));
		passengerService.deletePassenger(passengerId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editPassenger", method = RequestMethod.GET)
	public ModelAndView editPassenger(HttpServletRequest request) {
		int passengerId = Integer.parseInt(request.getParameter("passengerId"));
		Passenger passenegr = passengerService.getPassengerById(passengerId);
		ModelAndView model = new ModelAndView("passengerForm");
	    model.addObject("passenger", passenegr);
		return model;
	}

	@RequestMapping(value="/seatSelectPage", method = RequestMethod.POST)
    public ModelAndView seatSelect(HttpServletRequest request,
            HttpServletResponse response,Service service,HttpSession session) throws ServletException {
		
	
        ModelAndView model = new ModelAndView("seatSelectPage");
        return model;     
    }
	
}
