package com.virtusa.travelline.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Station {
	private int stationId;
	private String stationName;
	public Station() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="stationtbl")
	public int getStationId() {
		return stationId;
	}
	public void setStationId(int stationId) {
		this.stationId = stationId;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	

}
