package com.virtusa.travelline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.travelline.dao.LoginDAO;
import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Login;
import com.virtusa.travelline.model.ServiceProvider;
@Service
@Transactional
public class LoginServiceImpl implements LoginService  {
	@Autowired
	private LoginDAO loginDao;
	
	
	

	@Override
	public AccountHolder accountHolderValidate(Login login) {
		 AccountHolder userfound=loginDao.accountHolderValidate(login);
		


		return userfound ;
	}

	@Override
	public ServiceProvider serviceProviderValidate(Login login) {
		ServiceProvider serviceproviderfound=loginDao.serviceProviderValidate(login);
		// TODO Auto-generated method stub
		return serviceproviderfound;
	}

}
