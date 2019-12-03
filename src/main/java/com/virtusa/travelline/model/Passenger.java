package com.virtusa.travelline.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Passenger {
	
	private String passengerName;
	private int passengerAge;
	private String passengerGender;
	private String proofIdNumber;
	
	
	public Passenger()
	
	{
		super();
	}
	@Override
	public String toString() {
		return "Passenger [ passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", passengerGender=" + passengerGender + ", proofIdNumber=" + proofIdNumber
				+ " ";
	}
	

	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
	public String getProofIdNumber() {
		return proofIdNumber;
	}
	public void setProofIdNumber(String proofIdNumber) {
		this.proofIdNumber = proofIdNumber;
	}

	
	
	

}
