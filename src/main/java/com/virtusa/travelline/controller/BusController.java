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

import com.virtusa.travelline.model.BusType;
import com.virtusa.travelline.model.TicketDetails;
import com.virtusa.travelline.service.BusService;

@Controller
public class BusController {
	@Autowired
	private BusService  busService;

	@RequestMapping(value = "/viewBus",method=RequestMethod.GET)
	public ModelAndView listBus(ModelAndView model) throws IOException {
		List<BusType> listBus = busService.getAllBus();
		model.addObject("listBus", listBus);
		model.setViewName("index");
		return model;
	}

	@RequestMapping(value = "/addBus", method = RequestMethod.GET)
	public ModelAndView addBus(ModelAndView model) {
		BusType bus = new BusType();
		model.addObject("bus", bus);
		model.setViewName("BusForm");
		return model;
	}

	@RequestMapping(value = "/saveBus", method = RequestMethod.POST)
	public ModelAndView saveBus(@ModelAttribute BusType bus) {
		if (bus.getTypeId() == 0) { // if bus id is 0 then creating the
			// ticket other updating the bus
			busService.addBus(bus);
		} else {
			busService.updateBus(bus.getTypeId());
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteBus", method = RequestMethod.GET)
	public ModelAndView deleteBus(HttpServletRequest request) {
		int busId = Integer.parseInt(request.getParameter("busId"));
		busService.deleteBus(busId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editBus", method = RequestMethod.GET)
	public ModelAndView editPassenger(HttpServletRequest request) {
		int busId = Integer.parseInt(request.getParameter("busId"));
		BusType bus = busService.getBusById(busId);
		ModelAndView model = new ModelAndView("BusForm");
	    model.addObject("bus", bus);
		return model;
	}


}
