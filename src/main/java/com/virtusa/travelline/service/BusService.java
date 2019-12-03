package com.virtusa.travelline.service;

import java.util.List;

import com.virtusa.travelline.model.BusType;
public interface BusService {

	public void addBus(BusType bus);
	public void deleteBus(int busId);
	public List<BusType> getAllBus();
	 public BusType getBusById(int busId);
	public BusType updateBus(int busId);

}
