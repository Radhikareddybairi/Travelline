package com.virtusa.travelline.dao;

import java.util.List;

import com.virtusa.travelline.model.BusType;
public interface BusDAO {
	public void addBus(BusType bus);
	public void deleteBus(int busId);
	public List<BusType> getAllBus();
	 public BusType getBusById(int busId);
	public BusType updateBus(int busId);

}
