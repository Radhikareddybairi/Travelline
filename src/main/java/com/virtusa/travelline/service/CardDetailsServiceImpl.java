
package com.virtusa.travelline.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.travelline.dao.CardDetailsDAO;
import com.virtusa.travelline.model.CardDetails;
import com.virtusa.travelline.model.TicketDetails;

@Service
@Transactional
public class CardDetailsServiceImpl  implements CardDetailsService{
	 public CardDetailsServiceImpl() {
		// TODO Auto-generated constructor stub
	
	
		super();
		
	}
	@Autowired
	private CardDetailsDAO cardDetailsDao;

	
	 @Transactional

	public void addCardDetails(CardDetails cd) {
		cardDetailsDao.addCardDetails(cd);
		
		
	}
@Transactional
	public void deleteCardDetails(double cardNo) {
		// TODO Auto-generated method stub
		cardDetailsDao.deleteCardDetails(cardNo);
		
	}
@Transactional

	public CardDetails findCardDetailsById(int cardNo) {
		// TODO Auto-generated method stub
		return cardDetailsDao.findCardDetailsById(cardNo);
	}
@Transactional
	public List<CardDetails> getallCardDetails() {
		// TODO Auto-generated method stub
		return cardDetailsDao.getallCardDetails();
	}
@Override
public CardDetails updateCardDetails(long cardNo) {
	// TODO Auto-generated method stub
	return cardDetailsDao.updateCardDetails(cardNo);
	}

}
	

