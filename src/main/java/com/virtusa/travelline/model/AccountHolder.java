package com.virtusa.travelline.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.UniqueConstraint;
@Entity
@Table(name= "AccountHolder",uniqueConstraints= @UniqueConstraint(columnNames = {"accountHolderName", "accountHolderPassword"}) )
public class AccountHolder  implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public AccountHolder() {
		super();
	}
	
	private int accountId;
	@Column
	 private String accountHolderName;
	@Column
	 private String accountHolderMailId;
	@Column
    private String accountHolderPassword;
      @Column
	 private Long accountHolderMobileNo;
   /*   private List<TicketDetails> ticketdetails;*/
  private List<Passenger> passenger;
	@GeneratedValue(strategy = GenerationType.TABLE,generator="account")
	@Id
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderMailId() {
		return accountHolderMailId;
	}
	public void setAccountHolderMailId(String accountHolderMailId) {
		this.accountHolderMailId = accountHolderMailId;
	}
	public String getAccountHolderPassword() {
		return accountHolderPassword;
	}
	public void setAccountHolderPassword(String accountHolderPassword) {
		this.accountHolderPassword = accountHolderPassword;
	}
	public Long getAccountHolderMobileNo() {
		return accountHolderMobileNo;
	}
	public void setAccountHolderMobileNo(Long accountHolderMobileNo) {
		this.accountHolderMobileNo = accountHolderMobileNo;
	}
	
	@ElementCollection
	
	public List<Passenger> getPassenger() {
		return passenger;
	}
	
	/*@JoinColumn(name="accountId")
	@OneToMany(
	fetch = FetchType.EAGER ,cascade = {CascadeType.ALL})*/
/*	public List<TicketDetails> getTicketdetails() {
		return ticketdetails;
	}
	public void setTicketdetails(List<TicketDetails> ticketdetails) {
		this.ticketdetails = ticketdetails;
	}*/
	@Override
	public String toString() {
		return "AccountHolder [accountId=" + accountId + ", accountHolderName=" + accountHolderName
				+ ", accountHolderMailId=" + accountHolderMailId + ", accountHolderPassword=" + accountHolderPassword
				+ ", accountHolderMobileNo=" + accountHolderMobileNo + "]";
	}
	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
	
	
	
	}
