package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.sm.ugb.models.entities.Exchange;
import com.sm.ugb.models.repository.ExchangeRepository;

@Service
public class ExchangeServiceImpl implements ExchangeService{

	@Autowired
	public ExchangeRepository repository;
	@Override
	public List<Exchange> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exchange save(Exchange entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Exchange> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
