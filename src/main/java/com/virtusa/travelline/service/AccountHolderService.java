package com.virtusa.travelline.service;

import java.util.List;

import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Passenger;



public interface AccountHolderService {
public void addAccountHolder(AccountHolder accountholder) ;
		
	
	public void deleteAccountHolder( int accountId) ;
		
		
		
	
	public AccountHolder updateAccountHolder(AccountHolder accountholder) ;
		
	
		
	
	public AccountHolder fetchByAccountId(int accountId) ;
		 
	public List<AccountHolder> viewAll();


	public void addPassenger(List<Passenger> pas);



		
	}


