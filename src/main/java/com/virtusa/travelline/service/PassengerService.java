package com.virtusa.travelline.service;

import java.util.List;

import com.virtusa.travelline.model.Passenger;

public interface PassengerService {
	public void addPassenger(List<Passenger> passenger);
	public void deletePassenger(int passengerId);
	public List<Passenger> getAllPassenger();
	 public Passenger getPassengerById(int passengerId);
	public Passenger updatePassenger(int passengerId);
}
