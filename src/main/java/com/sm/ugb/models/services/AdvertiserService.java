package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import com.sm.ugb.models.entities.Advertiser;

public interface AdvertiserService {
	
	public List<Advertiser> findAll();
	
	public Advertiser save(Advertiser entity);
	
	public Optional<Advertiser> findById(Long id);
	
	public void delete(Advertiser id);
	
}