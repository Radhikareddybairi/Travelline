package com.virtusa.travelline.service;

import java.util.List;

import com.virtusa.travelline.model.ServiceProvider;



public interface ServiceProviderService {
	void add(ServiceProvider serviceProvider);
void delete( int serviceProviderId );
ServiceProvider update(ServiceProvider serviceProvider);
public ServiceProvider fetchById(int serviceProviderId);
public List<ServiceProvider> viewAll();
List<ServiceProvider> viewRequests();


}
