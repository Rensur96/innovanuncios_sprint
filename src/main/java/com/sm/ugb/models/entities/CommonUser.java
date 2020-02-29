package com.sm.ugb.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="common_user")
public class CommonUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "user_id", nullable=false)
	private UsersList userList;
	
	@Column(name="ulist_user_id")
	@Id
	private long ulistUserId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="address")
	private String address;
	
	@Column(name="cellphone")
	private char[] cellphone;
	
	
}
