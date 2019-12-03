package com.virtusa.travelline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.travelline.dao.BusDAO;
import com.virtusa.travelline.dao.PassengerDAO;
import com.virtusa.travelline.model.BusType;
import com.virtusa.travelline.model.Passenger;
@Service
@Transactional
public class BusServiceImpl implements BusService{
	
	@Autowired
	private BusDAO busDAO;

	@Override
	@Transactional
	public void addBus(BusType bus) {
		
		busDAO.addBus(bus);
		
	}

	@Override
	@Transactional
	public void deleteBus(int busId) {
		
		busDAO.deleteBus(busId);
		
	}

	@Override
	@Transactional
	public List<BusType> getAllBus() {

		return busDAO.getAllBus();
	}

	@Override
	public BusType getBusById(int busId) {
	
		return busDAO.getBusById(busId);
	}

	@Override
	@Transactional
	public BusType updateBus(int busId) {

		return busDAO.updateBus(busId);
	} 

}
