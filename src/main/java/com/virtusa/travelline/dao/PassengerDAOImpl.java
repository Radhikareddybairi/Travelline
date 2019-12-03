package com.virtusa.travelline.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.travelline.model.Passenger;

@Repository
public class PassengerDAOImpl implements PassengerDAO{
	public PassengerDAOImpl()
	{
		super();
	}
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addPassenger(Passenger passengers) {
		/*for(Passenger passenger : passengers) {
			System.out.println("in forkloop");
		  

		this.sessionFactory.getCurrentSession().save(passenger);
		
	}*/
		this.sessionFactory.getCurrentSession().save(passengers);
		System.out.println("in dao impl");
	}

	@Override
	public void deletePassenger(int passengerId) {

		Session session = this.sessionFactory.getCurrentSession();
	    
		
		 Passenger passenger =  sessionFactory.getCurrentSession().load(
	             Passenger.class, passengerId);
	     if (null != passenger) {
	         this.sessionFactory.getCurrentSession().delete(passenger);
	     }
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Passenger> getAllPassenger() {

		Session session = this.sessionFactory.getCurrentSession();
		
		
		return sessionFactory.getCurrentSession().createQuery("from Passenger").list();
		
	}

	@Override
	public Passenger getPassengerById(int passengerId) {

		Session session = this.sessionFactory.getCurrentSession();	
		Passenger passenger = (Passenger) session.load(Passenger.class, passengerId);
		return passenger;

		
	}

	@Override
	public Passenger updatePassenger(int passengerId) {

		Session session = this.sessionFactory.getCurrentSession();
        
		
		  return  sessionFactory.getCurrentSession().get(
	                Passenger.class, passengerId);
		
	}

}
