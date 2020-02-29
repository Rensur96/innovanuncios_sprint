package com.sm.ugb.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Users_list")
public class UsersList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@Column(name="levelRole")
	@NotEmpty
	private String levelRole;
	
	@Column(name="isActive")
	@NotEmpty
	private boolean isActive;
}
