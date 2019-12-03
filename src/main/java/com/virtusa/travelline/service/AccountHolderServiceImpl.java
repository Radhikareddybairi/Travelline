package com.virtusa.travelline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.travelline.dao.AccountHolderDAO;
import com.virtusa.travelline.dao.AccountHolderDAOImpl;
import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Passenger;

@Service
@Transactional
public  class AccountHolderServiceImpl implements AccountHolderService {
	
	public AccountHolderServiceImpl() {
		super();
	}
	@Autowired
	private AccountHolderDAO accountHolderdao;
	
	@Transactional
	@Override
	public void addAccountHolder(AccountHolder accountholder) {
		
		accountHolderdao.add(accountholder);
		
		
		
	}@Override
	@Transactional
	public void deleteAccountHolder( int accountId) {
		accountHolderdao.delete(accountId);
		
		
		
	}
	@Transactional
	public AccountHolder updateAccountHolder(AccountHolder accountholder) {
		accountHolderdao.update(accountholder);
		 return accountholder;
	
		
	}@Transactional
	public AccountHolder fetchByAccountId(int accountId) {
		 AccountHolder account=accountHolderdao.fetchById(accountId);
		 return account;
		}
	@Override
	@Transactional
	public List<AccountHolder> viewAll(){
	List<AccountHolder>	 allAccounts=accountHolderdao.viewAll();
	return allAccounts;
		
		
	}
	@Override
	public void addPassenger(List<Passenger> pas) {
		accountHolderdao.add(pas);
		
	}

	

	
	

}
