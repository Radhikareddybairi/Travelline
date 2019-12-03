package com.virtusa.travelline.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.travelline.dao.StationDAO;
import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Login;
import com.virtusa.travelline.model.Service;
import com.virtusa.travelline.model.ServiceProvider;

import com.virtusa.travelline.service.AccountHolderService;
import com.virtusa.travelline.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	@Autowired
	private StationDAO stationdao;
	@Autowired
	private HttpSession ses;
	
	
	


	
	
	
	@RequestMapping(value ="/" , method = RequestMethod.GET)
    public 	ModelAndView homepage(@ModelAttribute("command") Login login,Service service){
		ModelAndView model=new ModelAndView("homepage");
		
		
       model.addObject("service", new Service());
       return model;

    }

	@RequestMapping(value ="/s" , method = RequestMethod.GET)
    public 	ModelAndView homepage1(@ModelAttribute("command") Login login,Service service){
		ModelAndView model=new ModelAndView("homepage");
		
		
       model.addObject("service", new Service());
       return model;

    }

	@RequestMapping(value ="/serviceproviderloginform" , method = RequestMethod.GET)
    public 	ModelAndView homepage1(@ModelAttribute("command") Login login){
		ModelAndView model=new ModelAndView("Serviceproviderlogin");
		
		
       
       return model;

    }
	
	@RequestMapping(value ="/AccountHolderLogin", method = RequestMethod.POST)
    public ModelAndView loginprocess(Login login) {
		
		if(login.getUsername().equals("admin") && login.getPassword().equals("admin123")) {
			
			return new ModelAndView("/adminPage");
		}
		
     	AccountHolder userfound=	loginService.accountHolderValidate(login);
     	if(userfound!=null) {
     		ModelAndView model = new ModelAndView("passengerHomePage");
     		model.addObject("username",login.getUsername());
     		
     		 ses.setAttribute("AccountHolder",userfound);
          
           
             model.addObject("stationNames", stationdao.getAllStation());
             model.addObject("accountholder", userfound);
             model.addObject("service", new Service());

          
         
     		 return model;
     		 
     	}
     	else {
     		return new ModelAndView("redirect:/error");
     	}
     	
	}
	@RequestMapping(value ="/serviceProviderLogin", method = RequestMethod.POST)
	 public ModelAndView loginprocess2(Login login) {
			
	     ServiceProvider userfound=	loginService.serviceProviderValidate(login);
	     	if(userfound!=null) {
	     		 ses.setAttribute("ServiceProvider",userfound);
	             
	     	
	     		ModelAndView model = new ModelAndView("serviceProvider");
	     		model.addObject("ServiceProvider",userfound);
	     		 return model;
	     	}
	     	else {
	     		 return new ModelAndView("redirect:/error");
	     	}
	     	
		}
	@RequestMapping(value="/logout")
	public ModelAndView logout() {
		ses.invalidate();
		return new ModelAndView("redirect:/");
		
		
		
	}
	
	
	
	
	
	
	

}
