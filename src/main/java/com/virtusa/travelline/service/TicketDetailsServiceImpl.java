package com.virtusa.travelline.service;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.travelline.dao.TicketDetailsDAO;
import com.virtusa.travelline.model.TicketDetails;
@Service
@Transactional
public class TicketDetailsServiceImpl  implements TicketDetailsService{
	public TicketDetailsServiceImpl()
	{
		super();
		
	}
	@Autowired
	private TicketDetailsDAO ticketdetailsDAO;

	@Override
	 @Transactional
	public void addTicket(TicketDetails ticketdetails) {
		ticketdetailsDAO.addTicket(ticketdetails);
		
	}
	@Override
	 @Transactional
	public void deleteTicket(int ticketId) {
		ticketdetailsDAO.deleteTicket(ticketId);
		
	}
	@Override 
	 @Transactional
	public List<TicketDetails> getAllTicketDetails() {
		return ticketdetailsDAO.getAllTicketDetails();
	}
@Override
	public TicketDetails getTicketDetailsById(int ticketId) {
		return ticketdetailsDAO.getTicketDetailsById(ticketId);
	}
@Override
@Transactional
	public TicketDetails updateTicketDetails(int ticketId) {
		return ticketdetailsDAO.updateTicketDetails(ticketId);
	}

}
