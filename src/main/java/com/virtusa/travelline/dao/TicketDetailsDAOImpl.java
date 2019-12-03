package com.virtusa.travelline.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.travelline.model.TicketDetails;
@Repository
public class TicketDetailsDAOImpl  implements TicketDetailsDAO
{
	public TicketDetailsDAOImpl()
	{
		super();
	}
	@Autowired
	private SessionFactory sessionFactory;

@Override
	public void addTicket(TicketDetails ticketdetails) {
		// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	
			sessionFactory.getCurrentSession().saveOrUpdate(ticketdetails);
		
	
		//session.persist(ticketdetails);


	}
@Override
	public void deleteTicket(int ticketId) {
		// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
    
	
	 TicketDetails ticketdetails = (TicketDetails) sessionFactory.getCurrentSession().load(
             TicketDetails.class, ticketId);
     if (null != ticketdetails) {
         this.sessionFactory.getCurrentSession().delete(ticketdetails);
     }
  
	}

	

	public TicketDetails fetchById(int ticketId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();	
		
		TicketDetails ticketdetails = (TicketDetails) session.load(TicketDetails.class, ticketId);
	
		return ticketdetails;
		
	}
	@Override
	public TicketDetails getTicketDetailsById(int ticketId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();	
	
		TicketDetails ticketdetails = (TicketDetails) session.load(TicketDetails.class, ticketId);
	
		return ticketdetails;

	} @SuppressWarnings("unchecked")
	public List<TicketDetails> getAllTicketDetails() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
	
	
		return sessionFactory.getCurrentSession().createQuery("from TicketDetails").list();

	}

	@Override
	public TicketDetails updateTicketDetails(int ticketId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        
	
		  return (TicketDetails) sessionFactory.getCurrentSession().get(
	                TicketDetails.class, ticketId);
	}
}










