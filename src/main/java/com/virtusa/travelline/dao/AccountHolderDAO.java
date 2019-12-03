package com.virtusa.travelline.dao;

import java.util.List;

import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Passenger;

public interface AccountHolderDAO {
	void add(AccountHolder accountHolder);
	void delete( int accountId);
	AccountHolder update(AccountHolder accountholder);
	public AccountHolder fetchById(int accountId);
	public List<AccountHolder> viewAll();
	void add(List<Passenger> pas);
	}
