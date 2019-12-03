package com.virtusa.travelline.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SeatDetails {
	int ticketId;
	int seatId;
	int seatNumber;
	int busId;
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	@Id
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public SeatDetails() {
		super();
	}
	
	

}
