package com.virtusa.travelline.dao;

import java.util.List;

import com.virtusa.travelline.model.Station;

public interface StationDAO {
	public void addStation(Station station);
	public void deleteStation(int stationId);
	public List<Station> getAllStation();
	 public Station getStationById(int stationId);
	public Station updateStation(int stationId);

}
