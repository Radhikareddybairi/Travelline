package com.virtusa.travelline.dao;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.travelline.model.Service;
import com.virtusa.travelline.model.ServiceProvider;
import com.virtusa.travelline.model.TicketDetails;
@Repository
@Transactional
public class ServiceDAOImpl  implements ServiceDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
   @Transactional
	@Override
	public void addService(Service service) {
	  
		Session session = this.sessionFactory.getCurrentSession();
		
		sessionFactory.getCurrentSession().saveOrUpdate(service);
		
	
	}
   @Transactional
	@Override
	public void deleteService(int serviceId) {
		
		
		
		Session session = this.sessionFactory.getCurrentSession();
	    
		
		 Service service = (Service) sessionFactory.getCurrentSession().load(
	             Service.class, serviceId);
	     if (null != service) {
	         this.sessionFactory.getCurrentSession().delete(service);
	     }
	
	}
   @Transactional
	@Override
	public Service updateService(int serviceId) {
		
		
		Session session = this.sessionFactory.getCurrentSession();
        
		
		  return   sessionFactory.getCurrentSession().get(Service.class,serviceId);
		
		
		
		
		
	}

	@Override
	public Service getservice(int serviceId) {
		
		Session session = this.sessionFactory.getCurrentSession();	
		
		Service service = (Service) session.load(Service.class, serviceId);
	
		return service;
		
	}
	 @Transactional
	@Override
	public List<Service> getAllService() {
		
		
		Session session = this.sessionFactory.getCurrentSession();
		
		
		return sessionFactory.getCurrentSession().createQuery("from Service").list();

		
	}
	@Override
	public List<Service> searchService(Service service) {
		// TODO Auto-generated method stub
	String hql = "from Service where srFrom Like :srfrom and srTo Like:srTo" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		System.out.println(service.getSrFrom());
		query.setParameter("srfrom",service.getSrFrom());
		query.setParameter("srTo",service.getSrTo());
		List<Service> resultsList = query.list();
		
	            return resultsList;
	}
	@Override
	public List<Service> viewServices(int sid) {

		Session session = this.sessionFactory.getCurrentSession();	

		return sessionFactory.getCurrentSession().createQuery("from Service where  serviceProviderId="+sid+"").list();
		
		
		// TODO Auto-generated method stub
		
	}

}
