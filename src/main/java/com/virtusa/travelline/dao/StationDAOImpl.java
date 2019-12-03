package com.virtusa.travelline.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.travelline.model.Station;
import com.virtusa.travelline.model.TicketDetails;
@Transactional
@Repository
public class StationDAOImpl implements StationDAO{
	public StationDAOImpl()
	{
		super();
	}
	@Autowired
	private SessionFactory sessionFactory;

	

	@Override
	public void addStation(Station station) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		
		sessionFactory.getCurrentSession().saveOrUpdate(station);
		
	}

	@Override
	public void deleteStation(int stationId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
	    
		
		 Station station = (Station) sessionFactory.getCurrentSession().load(
	             Station.class, stationId);
	     if (null != station) {
	         this.sessionFactory.getCurrentSession().delete(station);
	     }
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Station> getAllStation() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		
		
		return sessionFactory.getCurrentSession().createQuery("from Station").list();

		
	}

	@Override
	public Station getStationById(int stationId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();	
		
		Station station = (Station) session.load(Station.class, stationId);
		
		return station;
	}

	@Override
	public Station updateStation(int stationId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        
		
		  return (Station) sessionFactory.getCurrentSession().get(
	                Station.class, stationId);
	}

}
