package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import com.sm.ugb.models.entities.Exchange;

public interface ExchangeService {
	
	public List<Exchange> findAll();
	
	public Exchange save(Exchange entity);
	
	public Optional<Exchange> findById(Long id);
	
	public void delete(Exchange entity);
	
}