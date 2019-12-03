package com.virtusa.travelline.service;

import java.util.List;

import com.virtusa.travelline.model.CardDetails;
import com.virtusa.travelline.model.TicketDetails;

public interface CardDetailsService {

	public void addCardDetails(CardDetails cd);
	public void deleteCardDetails(double cardNo);
	public CardDetails findCardDetailsById(int cardNo);
	public List<CardDetails> getallCardDetails();
	public CardDetails updateCardDetails(long cardNo);

}

