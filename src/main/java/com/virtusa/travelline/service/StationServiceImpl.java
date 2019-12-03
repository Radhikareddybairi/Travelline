package com.virtusa.travelline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.travelline.dao.StationDAO;
import com.virtusa.travelline.dao.TicketDetailsDAO;
import com.virtusa.travelline.model.Station;
@Service
@Transactional
public class StationServiceImpl implements StationService {
	public StationServiceImpl()
	{
		super();
		
	}
	@Autowired
	private StationDAO stationDAO;

	@Override
	@Transactional
	public void addStation(Station station) {
		// TODO Auto-generated method stub
		stationDAO.addStation(station);
		
	}

	@Override
	@Transactional
	public void deleteStation(int stationId) {
		// TODO Auto-generated method stub
		stationDAO.deleteStation(stationId);
		
	}

	@Override
	@Transactional
	public List<Station> getAllStation() {
		// TODO Auto-generated method stub
		return stationDAO.getAllStation();
	}

	@Override
	public Station getStationById(int stationId) {
		// TODO Auto-generated method stub
		return stationDAO.getStationById(stationId);
	}

	@Override
	@Transactional
	public Station updateStation(int stationId) {
		// TODO Auto-generated method stub
		return stationDAO.updateStation(stationId);
	}

}
