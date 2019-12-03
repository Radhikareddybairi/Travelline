package com.virtusa.travelline.controller;


import java.util.List;

import javax.persistence.ElementCollection;
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
import com.virtusa.travelline.service.AccountHolderService;


@Controller
public class AccountHolderController {
    @Autowired
	private AccountHolderService accountHolderService;
	

	@RequestMapping(value = "/viewAccounts", method=RequestMethod.GET )
	    public ModelAndView listAccounts(ModelAndView model)   {
	        List<AccountHolder> listofaccounts = accountHolderService.viewAll();
	       
	        model.addObject("listofaccounts",listofaccounts);
	 
	        model.setViewName("accountIndex");
	        return model;
	    }
	@RequestMapping(value="/savePassenger",method = RequestMethod.POST)
	public ModelAndView savePassengers(@ModelAttribute AccountHolder accountholder,HttpSession session) {
		List<Passenger> pas=accountholder.getPassenger();
		
		accountholder=(AccountHolder) session.getAttribute("AccountHolder");
		
		accountholder.setPassenger(pas);
		
		System.out.println(accountholder);
		
		accountHolderService.addAccountHolder(accountholder);
		
		
		
			
			
		
		
		return new ModelAndView("Payment","payment",new Payment());
	}
	
	 
	@RequestMapping(value ="/newUser", method = RequestMethod.GET)
    public ModelAndView newUser(ModelAndView model) {
		AccountHolder accountholder=new AccountHolder();
       
        model.addObject("accountHolder",accountholder);
        model.setViewName("RegistrationPage");
        return model;
    }
	@RequestMapping( value= "/saveAccountHolder",method = RequestMethod.POST)
    public ModelAndView saveAccount(@ModelAttribute AccountHolder accountHolder) {
		
        if (accountHolder.getAccountId() == 0) { 
           accountHolderService.addAccountHolder(accountHolder);
        } else {
            accountHolderService.updateAccountHolder(accountHolder);
        }
        return new ModelAndView("redirect:/");
    }
	  @RequestMapping(value = "/deleteAccount", method = RequestMethod.GET)
	    public ModelAndView deleteAccount(HttpServletRequest request) {
	        int AccountId = Integer.parseInt(request.getParameter("id"));
	        accountHolderService.deleteAccountHolder(AccountId);
	        return new ModelAndView("redirect:/");
	    }

	    @RequestMapping(value = "/editAccountdetails", method = RequestMethod.GET)
	    public ModelAndView editAccount(HttpServletRequest request) {
	        int AccountId = Integer.parseInt(request.getParameter("id"));
	      AccountHolder accountHolder=accountHolderService.fetchByAccountId(AccountId);
	        ModelAndView model = new ModelAndView("RegistrationPage");
	        model.addObject("accountHolder", accountHolder);
	 
	        return model;
	    }
	 

	

}