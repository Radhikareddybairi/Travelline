package com.virtusa.travelline.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Payment {
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", totalFare=" + totalFare + ", ticketdetails=" + ticketdetails
				+ ", carddetails=" + carddetails + "]";
	}
	private int paymentId;
	private long totalFare;
	
	private TicketDetails ticketdetails;
	private CardDetails carddetails;
public Payment()
{
	super();
	
}
@Id
@GeneratedValue(strategy=GenerationType.TABLE)

public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public long getTotalFare() {
	return totalFare;
}
public void setTotalFare(long totalFare) {
	this.totalFare = totalFare;
}

@JoinColumn(name="ticketId")
@OneToOne(cascade=CascadeType.ALL)
public TicketDetails getTicketdetails() {
	return ticketdetails;
}
public void setTicketdetails(TicketDetails ticketdetails) {
	this.ticketdetails = ticketdetails;
}
@JoinColumn(name="cardNo")
@ManyToOne(cascade=CascadeType.ALL)
public CardDetails getCarddetails() {
	return carddetails;
}
public void setCarddetails(CardDetails carddetails) {
	this.carddetails = carddetails;
}


}
