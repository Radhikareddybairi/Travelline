package com.virtusa.travelline.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.travelline.model.TicketDetails;
import com.virtusa.travelline.service.TicketDetailsService;
@Controller
public class TicketController {
	@Autowired
	private TicketDetailsService ticketService;



	

	

	@RequestMapping(value = "/addTicket", method = RequestMethod.GET)
	public ModelAndView addTicket(ModelAndView model) {
		TicketDetails ticketdetails = new TicketDetails();
		model.addObject("ticket", ticketdetails);
		model.setViewName("ticketform");
		return model;
	}

	@RequestMapping(value = "/saveTicket", method = RequestMethod.POST)
	public ModelAndView saveTicket(@ModelAttribute TicketDetails ticket) {
		if (ticket.getTicketId() == 0) { // if ticket id is 0 then creating the
			// ticket other updating the ticket
			ticketService.addTicket(ticket);
		} else {
			ticketService.updateTicketDetails(ticket.getTicketId());
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteTicket", method = RequestMethod.GET)
	public ModelAndView deleteTicket(HttpServletRequest request) {
		int ticketId = Integer.parseInt(request.getParameter("ticketId"));
		ticketService.deleteTicket(ticketId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editTicket", method = RequestMethod.GET)
	public ModelAndView editTicket(HttpServletRequest request) {
		int ticketId = Integer.parseInt(request.getParameter("ticketId"));
		TicketDetails ticket = ticketService.getTicketDetailsById(ticketId);
		ModelAndView model = new ModelAndView("ticketform");
	    model.addObject("ticket", ticket);
		return model;
	}

}
