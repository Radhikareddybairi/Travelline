package com.virtusa.travelline.dao;

import java.util.List;

import com.virtusa.travelline.model.Passenger;



public interface PassengerDAO {
	public void addPassenger(Passenger passengers);
	public void deletePassenger(int passengerId);
	public List<Passenger> getAllPassenger();
	 public Passenger getPassengerById(int passengerId);
	public Passenger updatePassenger(int passengerId);


}
