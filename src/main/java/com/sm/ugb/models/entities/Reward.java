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
@Table(name="rewards")
public class Reward implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="rewardId")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long rewardId;
	
	@Column(name="ulistAdvertiserAd")
	private long ulistAdvertiserId;
	
	@Column(name="pointsRequired")
	private int pointsRequired;
	
	@Column(name="rewardName")
	private String rewardName;
	
	@Column(name="rewardDescription")
	private String rewardDescription;
	
	@Column(name="datePublished")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date datePublished;
	
	@Column(name="isActive")
	private boolean isActive;

	public int getPointsRequired() {
		return pointsRequired;
	}

	public void setPointsRequired(int pointsRequired) {
		this.pointsRequired = pointsRequired;
	}

	public String getRewardName() {
		return rewardName;
	}

	public void setRewardName(String rewardName) {
		this.rewardName = rewardName;
	}

	public String getRewardDescription() {
		return rewardDescription;
	}

	public void setRewardDescription(String rewardDescription) {
		this.rewardDescription = rewardDescription;
	}

	public Date getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getRewardId() {
		return rewardId;
	}

	public long getUlistAdvertiserId() {
		return ulistAdvertiserId;
	}
	
	
}
