package com.virtusa.travelline.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.travelline.dao.AccountHolderDAO;
import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Passenger;
@Repository
public class AccountHolderDAOImpl implements AccountHolderDAO {
	public AccountHolderDAOImpl() {
		super();
		
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void add(AccountHolder accountHolder) {
		Session ses=sessionFactory.getCurrentSession();
		  
		ses.saveOrUpdate(accountHolder);
		
		
		
		
		
	}
	
	@Override
	public void delete(int accountId) {
		Session ses=sessionFactory.getCurrentSession();
		
		
		AccountHolder ac = (AccountHolder)ses.load(
                AccountHolder.class, accountId);
        if (ac!=null) {
            this.sessionFactory.getCurrentSession().delete(ac);
        }
		
		
		
		
	}
	@Override
	public AccountHolder update(AccountHolder accountHolder) {
		 Session ses=sessionFactory.getCurrentSession();
		 ses.update(accountHolder);
      return accountHolder;
		
		
		
		
		
		
	}
	
	public AccountHolder fetchById(int accountId) {
		 return (AccountHolder) sessionFactory.getCurrentSession().get(
	                AccountHolder.class, accountId);
	    }
    
		
		
		
		
	

	@SuppressWarnings("unchecked")
	public List<AccountHolder> viewAll() {
		return sessionFactory.getCurrentSession().createQuery("from AccountHolder")
                .list();
    }

	@Override
	public void add(List<Passenger> pas) {
		
		for(Passenger passenger:pas)
		this.sessionFactory.getCurrentSession().save(passenger);
		  
		
		
	
	}
		
	}
	

	


