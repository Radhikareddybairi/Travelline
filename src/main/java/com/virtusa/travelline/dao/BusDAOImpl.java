package com.virtusa.travelline.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.travelline.model.BusType;
import com.virtusa.travelline.model.Passenger;
@Repository
public class BusDAOImpl implements BusDAO {
	public BusDAOImpl()
	{
		super();
	}
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addBus(BusType bus) {
	
		Session session = this.sessionFactory.getCurrentSession();
		
		sessionFactory.getCurrentSession().saveOrUpdate(bus);
		
	}

	@Override
	public void deleteBus(int busId) {

		Session session = this.sessionFactory.getCurrentSession();
	    
		
		 BusType bus = (BusType) sessionFactory.getCurrentSession().load(
	             BusType.class, busId);
	     if (null != bus) {
	         this.sessionFactory.getCurrentSession().delete(bus);
	     }
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<BusType> getAllBus() {
		
		
		
		
		return sessionFactory.getCurrentSession().createQuery("from Bus").list();
		
	}

	@Override
	public BusType getBusById(int busId) {
		
		Session session = this.sessionFactory.getCurrentSession();	
		BusType bus = (BusType) session.load(BusType.class, busId);
		return bus;

		
	}

	@Override
	public BusType updateBus(int busId) {
	
		
		  return (BusType) sessionFactory.getCurrentSession().get(
	                BusType.class, busId);
		
	}


}
