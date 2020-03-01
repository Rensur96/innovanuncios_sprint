package com.sm.ugb.models.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Payments")
public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="payment_id")
	private long paymentId;
	
	@Column(name="advertiser_id")
	private long adversiterId;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="pay_date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date payDate;
	
	@Column(name="address_factures")
	private String addressFactured;

	public String getAddressFactured() {
		return addressFactured;
	}

	public void setAddressFactured(String addressFactured) {
		this.addressFactured = addressFactured;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public long getAdversiterId() {
		return adversiterId;
	}

	public double getAmount() {
		return amount;
	}

	public Date getPayDate() {
		return payDate;
	}
	
	
	
}
