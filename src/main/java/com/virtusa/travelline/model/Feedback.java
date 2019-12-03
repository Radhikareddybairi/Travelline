package com.virtusa.travelline.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	private String passengerName;
	private String emailId;
	private String comments;
	public Feedback() {
		super();
	}
	
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
@Id
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	

}
