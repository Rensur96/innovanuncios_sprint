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
@Table(name="exchanges")
public class Exchange implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="exchangeId")
	private long exchangeId;
	
	@Column(name="codeId")
	private long codeId;
	
	@Column(name="userId")
	private long userId;
	
	@Column(name="reddemedDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date reddemedDate;

	public long getExchangeId() {
		return exchangeId;
	}

	public long getCodeIde() {
		return codeId;
	}

	public long getUserId() {
		return userId;
	}

	public Date getReddemedDate() {
		return reddemedDate;
	}
	
	
}
