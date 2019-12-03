package com.virtusa.travelline.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestAttribute;

import com.virtusa.travelline.dao.ServiceProviderDAO;
import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.ServiceProvider;
@Repository
public class ServiceProviderDAOImpl implements ServiceProviderDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void add(ServiceProvider serviceProvider) {
		
		Session ses=sessionFactory.getCurrentSession();
		  
		ses.save(serviceProvider);
		
		
	}
 public void delete( int serviceProviderId ) {
	 Session ses=sessionFactory.getCurrentSession();
		
		
		ServiceProvider sc = (ServiceProvider)ses.load(
				ServiceProvider .class, serviceProviderId);
     if (sc!=null) {
         this.sessionFactory.getCurrentSession().delete(sc);
     }
	 
	 
	 
	 
 }
 public ServiceProvider update(ServiceProvider serviceProvider) {
	 
	 
	 Session ses=sessionFactory.getCurrentSession();
	 ses.update(serviceProvider);
  return serviceProvider;
	
}
public ServiceProvider fetchById(int serviceProviderId) {
	
	 return (ServiceProvider) sessionFactory.getCurrentSession().get(
			 ServiceProvider .class,serviceProviderId);
	
}

public List<ServiceProvider> viewAll(){
	String hql = " from ServiceProvider where accountStatus Like :accepted"; 
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	query.setParameter("accepted","accepted");
	List<ServiceProvider> resultsList = query.list();
	
            return resultsList;
	
	
	
}
@SuppressWarnings("unchecked")

public List<ServiceProvider> viewRequests() {
	String hql = " from ServiceProvider where accountStatus Like :pending"; 
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	query.setParameter("pending","pending");
	List<ServiceProvider> resultsList = query.list();
	
            return resultsList;
	
	
}


}
