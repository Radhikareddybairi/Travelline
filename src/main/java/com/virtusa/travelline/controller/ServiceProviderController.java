package com.virtusa.travelline.controller;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.ServiceProvider;
import com.virtusa.travelline.service.ServiceProviderService;
@Controller
public class ServiceProviderController {

	@Autowired
	
	private ServiceProviderService serviceproviderservice;

	

	
	
	
	
	
	
	

	@RequestMapping(value ="/viewserviceproviderrequests", method= RequestMethod.GET)
	public ModelAndView viewServiceProviderRequests( ModelAndView model) {
	List<ServiceProvider>	viewAllServiceProviders=serviceproviderservice.viewRequests();

		model.addObject("viewAllServiceProviders",viewAllServiceProviders);
		model.setViewName("viewServiceProvidersRequests");
		return model;
		
	}


	
	
	
	
	
	

	@RequestMapping(value ="/viewAllServiceProviders", method = RequestMethod.GET)
	public ModelAndView viewAllServiceProviders( ModelAndView model) {
	List<ServiceProvider>	viewAllServiceProviders=serviceproviderservice .viewAll();

		model.addObject("viewAllServiceProviders",viewAllServiceProviders);
		model.setViewName("viewServiceProviders");
		return model;}


	




	@RequestMapping(value ="/servcieproviderregistration", method = RequestMethod.GET)
	public ModelAndView newServiceProvider(ModelAndView model ) {
		ServiceProvider  serviceProvider=new ServiceProvider();
		 
		
		
	        model.addObject("serviceProvider", serviceProvider);
	        model.setViewName("serviceProviderRegistrationPage");
	        return model;


	}
	
	@RequestMapping(value = "/saveServiceProvider", method = RequestMethod.POST) 
	public String saveServiceProvider(@ModelAttribute ServiceProvider serviceProvider) {
		if (serviceProvider.getServiceProviderId() == 0) {
			serviceProvider.setAccountStatus("pending");
			serviceproviderservice.add(serviceProvider);
			return "serviceprovidermessage";
			
        } else {
        	serviceproviderservice.update(serviceProvider);
        	return "redirect:/viewAllServiceProviders";
            
        }
		
		
		
      

	
	    
	}
	@RequestMapping(value = "/deleteServiceProvider", method = RequestMethod.GET)
	public ModelAndView deleteServiceProvider(HttpServletRequest request) {
		int ServiceProviderId = Integer.parseInt(request.getParameter("id"));
		serviceproviderservice.delete(ServiceProviderId);
		return new ModelAndView("redirect:/viewserviceproviderrequests");
	}
	@RequestMapping(value = "/acceptRequest", method = RequestMethod.GET)
	public ModelAndView editContact( HttpServletRequest request ) {
	   
	 
	    int ServiceProviderId = Integer.parseInt(request.getParameter("id"));
	    ServiceProvider serviceProvider =serviceproviderservice.fetchById(ServiceProviderId);
	    System.out.println(serviceProvider);
	 
	    ModelAndView model = new ModelAndView("serviceProviderAcceptanceForm");
	    model.addObject("serviceProvider", serviceProvider);

	    return model;
	}



}
