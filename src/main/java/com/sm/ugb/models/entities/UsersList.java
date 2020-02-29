package com.sm.ugb.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Users_list")
public class UsersList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private long userId;
	
	@Column(name="user")
	@NotEmpty
	private String user;
	
	@Column(name="passwd")
	@NotEmpty
	private String passwd;
	
	@Column(name="email")
	@NotEmpty
	private String email;
	
	@Column(name="level_role")
	@NotEmpty
	private String levelRole;
	
	@Column(name="is_Active")
	@NotEmpty
	private boolean isActive;

	//Getters & Setters
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLevelRole() {
		return levelRole;
	}

	public void setLevelRole(String levelRole) {
		this.levelRole = levelRole;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
