package com.virtusa.travelline.model;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
public class Service  {

	private int serviceId;
	private String serviceNumber;
	private String srFrom;
	private String srTo;
	private int fare;
	private int distance;
	private String journeyDuration;
	private String journeyStartTime;
	private int  capacity;
	private BusType type;
	private int ServiceProviderId;
	private Date journeyDate;

	
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public int getServiceProviderId() {
		return ServiceProviderId;
	}
	public void setServiceProviderId(int serviceProviderId) {
		ServiceProviderId = serviceProviderId;
	}
	public Service(){
		super();
	}
@Id
@GeneratedValue(strategy=GenerationType.TABLE,generator="sevicetbl")
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public String getSrFrom() {
		return srFrom;
	}
	public void setSrFrom(String srFrom) {
		this.srFrom = srFrom;
	}
	public String getSrTo() {
		return srTo;
	}
	public void setSrTo(String srTo) {
		this.srTo = srTo;
	}

	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getJourneyDuration() {
		return journeyDuration;
	}
	public void setJourneyDuration(String journeyDuration) {
		this.journeyDuration = journeyDuration;
	}
	public String getJourneyStartTime() {
		return journeyStartTime;
	}
	public void setJourneyStartTime(String journeyStartTime) {
		this.journeyStartTime = journeyStartTime;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@OneToOne 
	(cascade = {CascadeType.ALL})
	@JoinColumn(name="typeId")
	public BusType getType() {
		return type;
	}
	public void setType(BusType type) {
		this.type = type;
	}
	
	
	

	
	
	
	
	

}
