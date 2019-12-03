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

import com.virtusa.travelline.model.Station;
import com.virtusa.travelline.model.TicketDetails;
import com.virtusa.travelline.service.StationService;
import com.virtusa.travelline.service.TicketDetailsService;

@Controller


public class StationController {
	@Autowired
	private StationService stationService;
   
	

	@RequestMapping(value = "/viewStation", method = RequestMethod.GET)
    public ModelAndView viewstations(@ModelAttribute("station") Station station) throws IOException {
		 ModelAndView model=new ModelAndView();
		List<Station> liststations = stationService.getAllStation();
		 
		 model.addObject("station",liststations);
		 model.setViewName("stationManagementPage");
		
		return model;
	}
	

	@RequestMapping(value ="/newStation", method = RequestMethod.GET)
	public ModelAndView addStation(ModelAndView model) {
		Station station = new Station();
		model.addObject("station", station);
		model.setViewName("stationForm");
		return model;
	}

	@RequestMapping(value = "/saveStation", method = RequestMethod.POST)
	public ModelAndView saveStation(@ModelAttribute Station station) {
		if (station.getStationId() == 0) { 
			stationService.addStation(station);
		} else {
			stationService.updateStation(station.getStationId());
		}
		return new ModelAndView("redirect:/viewStation");
	}

	@RequestMapping(value = "/deleteStation", method = RequestMethod.GET)
	public ModelAndView deleteStation(HttpServletRequest request) {
		int stationId = Integer.parseInt(request.getParameter("stationId"));
		stationService.deleteStation(stationId);
		return new ModelAndView("redirect:/viewStation");
	}

	@RequestMapping(value = "/editStation", method = RequestMethod.GET)
	public ModelAndView editStation(HttpServletRequest request) {
		int stationId = Integer.parseInt(request.getParameter("stationId"));
		Station station = stationService.getStationById(stationId);
		ModelAndView model = new ModelAndView("stationForm");
	    model.addObject("station", station);
		return model;
	}

}
