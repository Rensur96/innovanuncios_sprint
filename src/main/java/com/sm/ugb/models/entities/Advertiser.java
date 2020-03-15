package com.sm.ugb.models.entities;

import java.io.Serializable;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="advertisers")
public class Advertiser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "user_id", nullable=false)
	
	private UsersList userList;
	
	@Id
	@Column(name="ulist_adversiter_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ulistAdversiterId;
	
	@Column(name="corp_name")
	private String corpName;
	
	@Column(name="phone")
	private String phone;

	public long getUlistAdversiterId() {
		return ulistAdversiterId;
	}


	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public static Optional<Advertiser> getByid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
