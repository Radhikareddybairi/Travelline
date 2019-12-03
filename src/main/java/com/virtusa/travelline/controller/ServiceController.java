package com.virtusa.travelline.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.travelline.dao.ServiceDAO;
import com.virtusa.travelline.dao.StationDAO;
import com.virtusa.travelline.model.BusType;
import com.virtusa.travelline.model.Service;
import com.virtusa.travelline.model.ServiceProvider;
import com.virtusa.travelline.model.Station;

@Controller

public class ServiceController {
	
	
 
    @Autowired
    private ServiceDAO serviceDAO;
    @Autowired
    private StationDAO stationDAO;
    
    @RequestMapping(value = "/errorpage", method = RequestMethod.POST)
    public String particularServices1() {
    	return "errorpage";
    	
    	
    }
    
   
    
    
    @RequestMapping(value = "/viewParticularServices", method = RequestMethod.GET)
    public ModelAndView particularServices(HttpServletRequest req) {
    	int serviceproviderId=Integer.parseInt(req.getParameter("id"));
    	List<Service> service=serviceDAO.viewServices(serviceproviderId);
       
    	ModelAndView model =new ModelAndView("listofServices");
    	model.addObject("service",service);
        
        return model;
    }
    
  
   
    @RequestMapping(value = "/newService", method = RequestMethod.GET)
    public ModelAndView newService(ModelAndView model) {
    	Service service=new Service();
    	BusType bus=new BusType();
    	model.addObject("bus", bus);
    	model.addObject("service",service);
    	
       
        
        model.setViewName("addServiceForm");
        return model;
    }
 
    @RequestMapping(value = "/saveService", method = RequestMethod.POST)
    public String saveService(@ModelAttribute() Service service, HttpServletRequest req) {
    	HttpSession ses=req.getSession();
    	ServiceProvider ses1=(ServiceProvider)ses.getAttribute("ServiceProvider");
    	System.out.println("jhgjhg"+ses1.getServiceProviderName());
    
        if (service.getServiceId() == 0) { 
        	service.setServiceProviderId(ses1.getServiceProviderId());
           
            serviceDAO.addService(service);
            
        } else {
            serviceDAO.updateService(service.getServiceId());
        }
        return "listofServices";
    }
 
    @RequestMapping(value = "/deleteService", method = RequestMethod.GET)
    public ModelAndView deleteService(@RequestAttribute("ServiceId")Integer serviceId) {
        serviceDAO.deleteService(serviceId);
        return new ModelAndView("redirect:/");
    }
 
    @RequestMapping(value = "/editService", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        int ServiceId = Integer.parseInt(request.getParameter("ServiceId"));
        com.virtusa.travelline.model.Service service = serviceDAO.getservice(ServiceId);
        ModelAndView model = new ModelAndView("addServiceForm");
        model.addObject("services", service);
 
        return model;
    }
   
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView findServices( @ModelAttribute("command")Service service, HttpServletRequest req,HttpSession session) {
        List<Service> reqservices=serviceDAO.searchService(service);
        int noOfPassengers=Integer.parseInt(req.getParameter("noOfSeats"));
       System.out.print(noOfPassengers);
        session.setAttribute("noOfPassengers", noOfPassengers);
        session.setAttribute("dateOfJourney", service.getJourneyDate());
        if(session.getAttribute("AccountHolder")==null) {
       
     
        ModelAndView model = new ModelAndView("viewsevicerestrict");
        model.addObject("service",reqservices);
        req.setAttribute("services",reqservices);
        
       
        return model;
    }
        else { 
        	  ModelAndView model = new ModelAndView("viewService");
              model.addObject("service",reqservices);
              req.setAttribute("services",reqservices);
              return model;
        	
        }
       
    }
    
}