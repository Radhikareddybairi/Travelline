package com.virtusa.travelline.service;

import java.util.List;

import com.virtusa.travelline.model.TicketDetails;

public interface TicketDetailsService {
	public void addTicket(TicketDetails ticketdetails);
	public void deleteTicket(int ticketId);
	public List<TicketDetails> getAllTicketDetails();
	 public TicketDetails getTicketDetailsById(int ticketId);
public TicketDetails updateTicketDetails(int ticketId);

}

