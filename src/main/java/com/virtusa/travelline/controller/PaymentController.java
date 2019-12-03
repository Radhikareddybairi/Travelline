package com.virtusa.travelline.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Passenger;
import com.virtusa.travelline.model.Payment;
import com.virtusa.travelline.model.Service;
import com.virtusa.travelline.model.TicketDetails;
import com.virtusa.travelline.service.PaymentService;
@Controller
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	 public PaymentController(){
		super();
	}

	
	@RequestMapping(value = "/viewPayments",method=RequestMethod.GET)
	public ModelAndView viewPayment(@ModelAttribute("payment") ModelAndView model) throws IOException
	{
		List<Payment> payment= paymentService.getAllPayment();
		
		model.addObject("payment", payment);
		
		
		model.setViewName("payments");
		return model;
	}
@RequestMapping(value ="/savePayment", method = RequestMethod.POST)
	public ModelAndView savePayment(@ModelAttribute("payment")  Payment payment, HttpSession session ,HttpServletRequest req) {
	int fare=Integer.parseInt(req.getParameter("totalFare"));
	
		
		
		int noofpassengers=(int)session.getAttribute("noOfPassengers");
		AccountHolder accountholder=(AccountHolder)session.getAttribute("AccountHolder");
		Date date=(Date) session.getAttribute("dateOfJourney");
		System.out.println(accountholder);
		
		
		Date today = Calendar.getInstance().getTime();
		
		
		TicketDetails ticketdetails =new TicketDetails();
		System.out.println(date);
		ticketdetails.setJourneyDate(date);
	   ticketdetails.setBookedOn(today);
		ticketdetails.setNumberOfSeats(noofpassengers);
		ticketdetails.setPnrNO((long) (Math.random()*50+1));
		ticketdetails.setAccountholder(accountholder);
		List<Passenger> passenger=ticketdetails.getAccountholder().getPassenger();
	
		payment.setTicketdetails(ticketdetails);
		payment.setTotalFare(fare);

		
		 paymentService.addPayment(payment);
		 ModelAndView model =new ModelAndView();
		model.addObject("ticketdetails",ticketdetails);
		model.addObject("payment",payment);
		model.addObject("service",(Service)session.getAttribute("service1"));
		model.setViewName("Retrievalform");
		model.addObject("passenger", passenger);
		return model;
		
	
		
	}




}



