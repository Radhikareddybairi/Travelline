package com.virtusa.travelline.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Login;
import com.virtusa.travelline.model.ServiceProvider;
@Repository
public class LoginDAOImpl implements LoginDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public AccountHolder accountHolderValidate(Login login) {
	
		Session ses=sessionFactory.getCurrentSession();
		String username=login.getUsername();
		String password=login.getPassword();
		String selectquery="FROM AccountHolder as accounts WHERE accounts.accountHolderName = :username And accounts.accountHolderPassword =:password";
		
		Query query=ses.createQuery(selectquery);
		
		query.setParameter("username", username);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<AccountHolder> results = query.list();
		if(results.size()>0) {
			return results.get(0);
		
		
		} else {
			return null;
		}
		
		}
	public ServiceProvider serviceProviderValidate(Login login) {
	
		Session ses=sessionFactory.getCurrentSession();
		String username=login.getUsername();
		String password=login.getPassword();
		String query1=" from ServiceProvider as sp WHERE sp.username= :username And sp.password  = :password";
		Query query=ses.createQuery(query1);
		query.setParameter("username", username);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<ServiceProvider> results = query.list();
		if(results.size()>0) {
			return results.get(0);
		
		
		} else {
			return null;
		}
		
		
	}


}
