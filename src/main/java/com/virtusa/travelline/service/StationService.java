package com.virtusa.travelline.service;

import java.util.List;

import com.virtusa.travelline.model.Station;

public interface StationService {
	public void addStation(Station station);
	public void deleteStation(int stationId);
	public List<Station> getAllStation();
	 public Station getStationById(int stationId);
	public Station updateStation(int stationId);

}
