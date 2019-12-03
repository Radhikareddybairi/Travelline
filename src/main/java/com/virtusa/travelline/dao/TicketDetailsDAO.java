package com.virtusa.travelline.dao;

import java.util.List;

import com.virtusa.travelline.model.TicketDetails;

public interface TicketDetailsDAO {
	public void addTicket(TicketDetails ticketdetails);
	public void deleteTicket(int ticketId);
	public List<TicketDetails> getAllTicketDetails();
	 public TicketDetails getTicketDetailsById(int ticketId);
	public TicketDetails updateTicketDetails(int ticketId);
	

}
