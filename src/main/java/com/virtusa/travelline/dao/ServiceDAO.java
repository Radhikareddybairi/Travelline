package com.virtusa.travelline.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.jpa.repository.JpaRepository;


import com.virtusa.travelline.model.Service;

public interface ServiceDAO  {
	
	
	
	
	public void deleteService(int serviceId);
	public Service updateService(int serviceid);
	public  Service getservice(int serviceId);
	public List<Service> getAllService();
	public List<Service> searchService(Service service);
	public List<Service> viewServices(int sid);
	void addService(Service service);
	
	
}
	
