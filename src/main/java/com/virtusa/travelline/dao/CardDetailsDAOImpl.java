
package com.virtusa.travelline.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.virtusa.travelline.model.CardDetails;
import com.virtusa.travelline.model.TicketDetails;

@Repository
public class CardDetailsDAOImpl  implements CardDetailsDAO{
	
	public CardDetailsDAOImpl()
	{
		super();
	}
	@Autowired
	private SessionFactory sessionFactory;

	
	public void addCardDetails(CardDetails cd) {
		
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();

		sessionFactory.getCurrentSession().save(cd);
	

		
	}

	public void deleteCardDetails(double  cardNo) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();


		 CardDetails cd = (CardDetails) sessionFactory.getCurrentSession().load(
		         CardDetails.class, cardNo);
		 if (null != cd) {
		     this.sessionFactory.getCurrentSession().delete(cd);
		 }

		
	}

	public CardDetails findCardDetailsById(int cardNo) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();	

		CardDetails cd = (CardDetails) session.load(CardDetails.class, cardNo);

		return cd;
	
	}

	public List<CardDetails> getallCardDetails() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();


		return sessionFactory.getCurrentSession().createQuery("from CardDetails").list();
		
	}

	@Override
	public CardDetails updateCardDetails(long cardNo) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        
		
		  return (CardDetails) sessionFactory.getCurrentSession().get(
	                CardDetails.class, cardNo);
	}


	
	
}

