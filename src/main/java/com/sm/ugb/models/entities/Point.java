package com.sm.ugb.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="points")
public class Point implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ulistUserId")
	private long ulistUserId;
	
	@Column(name="advertiserId")
	private long advertiserId;
	
	@Column(name="points")
	private int points;

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public long getUlistUserId() {
		return ulistUserId;
	}

	public long getAdvertiserId() {
		return advertiserId;
	}
	
	

}
