package com.virtusa.travelline.model;


//import java.sql.Date;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class TicketDetails {
	private int ticketId;

	private long pnrNO;
	private Date journeyDate;
	
	private int numberOfSeats;
	private Date bookedOn; 
	private AccountHolder accountholder;
	
	public void setPnrNO(long pnrNO) {
		this.pnrNO = pnrNO;
	}


	public long getPnrNO() {
		return pnrNO;
	}

	
	@JoinColumn(name="accountId")
	@ManyToOne(cascade=CascadeType.ALL)
	public AccountHolder getAccountholder() {
		return accountholder;
	}

	public void setAccountholder(AccountHolder accountholder) {
		this.accountholder = accountholder;
	}

	public TicketDetails()
	{
		super();
	}
	
	@Id
	@TableGenerator(name="ticket")
	@GeneratedValue(strategy=GenerationType.TABLE,generator="ticket")
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	
	@DateTimeFormat(pattern = "dd/MM/yyyy") // This is for bind Date with @ModelAttribute
	  
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
	
		this.journeyDate = journeyDate;
		
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	 @DateTimeFormat(pattern = "dd/MM/yyyy") // This is for bind Date with @ModelAttribute

	public Date getBookedOn() {
		return bookedOn;
	}
	public void setBookedOn(Date bookedOn) {
		this.bookedOn = bookedOn;
	}


	

	
	}


	

	

