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
	@JoinColumn(name= "userId", nullable=false)
	private UsersList userList;
	
	@Column(name="ulistUserId")
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

	public UsersList getUserList() {
		return userList;
	}

	public void setUserList(UsersList userList) {
		this.userList = userList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char[] getCellphone() {
		return cellphone;
	}

	public void setCellphone(char[] cellphone) {
		this.cellphone = cellphone;
	}

	public long getUlistUserId() {
		return ulistUserId;
	}
	
	
	
}
