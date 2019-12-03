package com.virtusa.travelline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.travelline.dao.ServiceProviderDAO;
import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.ServiceProvider;
@Service
@Transactional
public class ServiceProviderServiceImpl implements ServiceProviderService {
	@Autowired
	private ServiceProviderDAO serviceProviderdao;
	public ServiceProviderServiceImpl() {
		
	}
	@Transactional
    @Override
	public void add(ServiceProvider serviceProvider) {
		 serviceProviderdao.add(serviceProvider);
		
		
	}
	@Transactional
    @Override
	public void delete( int serviceProviderId ) {
		
		serviceProviderdao.delete(serviceProviderId);
		
	}
	@Transactional
    @Override
	public ServiceProvider update(ServiceProvider serviceProvider) {
		serviceProviderdao.update(serviceProvider);
		return serviceProvider;
		
	}
	public ServiceProvider fetchById(int serviceProviderId) {
		 ServiceProvider sc=serviceProviderdao.fetchById(serviceProviderId);
		 return sc;
		 
		
	}@Transactional
    @Override
	public List<ServiceProvider> viewAll(){
		List<ServiceProvider>	 allServices=serviceProviderdao.viewAll();
		return allServices;
		
	}
	@Override
	@Transactional
	public List<ServiceProvider> viewRequests() {
		List<ServiceProvider>	 allServices=serviceProviderdao.viewRequests();
		return allServices;
	}


}
