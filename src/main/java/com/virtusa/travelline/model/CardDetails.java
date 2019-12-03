package com.virtusa.travelline.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity 
public class CardDetails {
	private long cardNo;
	private String holderName;
	private long cvv;
	private long availableBalance;
	
	public CardDetails() {
		super();
	}
	@Id
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public long getCvv() {
		return cvv;
	}
	public void setCvv(long cvv) {
		this.cvv = cvv;
	}
	public long getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(long availableBalance) {
		this.availableBalance = availableBalance;
	}
}