package com.virtusa.travelline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.travelline.dao.PassengerDAO;
import com.virtusa.travelline.dao.TicketDetailsDAO;
import com.virtusa.travelline.model.Passenger;


@Service
@Transactional
public class PassengerServiceImpl implements PassengerService{
	public PassengerServiceImpl()
	{
		super();
	}
	@Autowired
	private PassengerDAO passengerDAO;

	@Override
	@Transactional
	public void addPassenger(List<Passenger> passenger) {
	System.out.println("in service");
	for(Passenger passengers : passenger) {
		System.out.println("in service");
		System.out.println(passenger);
		
		passengerDAO.addPassenger(passengers);
		System.out.println("after for loop");
		
	}
		
	}

	@Override
	@Transactional
	public void deletePassenger(int passengerId) {
		// TODO Auto-generated method stub
		passengerDAO.deletePassenger(passengerId);
		
	}

	@Override
	@Transactional
	public List<Passenger> getAllPassenger() {
		// TODO Auto-generated method stub
		return passengerDAO.getAllPassenger();
	}

	@Override
	public Passenger getPassengerById(int passengerId) {
		// TODO Auto-generated method stub
		return passengerDAO.getPassengerById(passengerId);
	}

	@Override
	@Transactional
	public Passenger updatePassenger(int passengerId) {
		// TODO Auto-generated method stub
		return passengerDAO.updatePassenger(passengerId);
	} 
	
}
