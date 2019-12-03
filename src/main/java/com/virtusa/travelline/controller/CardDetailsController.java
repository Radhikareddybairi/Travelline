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

import com.virtusa.travelline.model.CardDetails;
import com.virtusa.travelline.model.TicketDetails;
import com.virtusa.travelline.service.CardDetailsService;

@Controller
public class CardDetailsController {
	@Autowired
	private CardDetailsService cardservice;

	@RequestMapping(value = "/viewCardDetails",method=RequestMethod.GET)
	public ModelAndView viewCard(@ModelAttribute("card") ModelAndView model) throws IOException {
		List<CardDetails> card = cardservice.getallCardDetails();
		
		model.addObject("card", card);
		
		model.setViewName("cardDetails");
		return model;
	}

	@RequestMapping(value = "/fillCardDetails", method = RequestMethod.GET)
	public ModelAndView fillCardDetails(@ModelAttribute("card") ModelAndView model) {
		CardDetails card = new CardDetails();
		model.addObject("card", card);
		model.setViewName("cardForm");
		return model;
	}
	@RequestMapping(value = "/saveCardDetails", method = RequestMethod.POST)
	public ModelAndView saveCardDetails(@ModelAttribute("card") CardDetails card) {
		if (card.getCardNo() == 0) { // if cardNO is 0 then creating the
			// cardNo other updating the ticket
			cardservice.addCardDetails(card);
		} else {
			cardservice.updateCardDetails(card.getCardNo());
		}
		return new ModelAndView("redirect:/viewCardDetails");

		}

	@RequestMapping(value = "/deleteCard", method = RequestMethod.GET)
	public ModelAndView deleteCardDetails(HttpServletRequest request) {
		long cardNo = Long.parseLong(request.getParameter("cardNo"));
		cardservice.deleteCardDetails(cardNo);
		return new ModelAndView("redirect:/");
	}

	
}
