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
		return (List<Exchange>)repository.findAll();
	}

	@Override
	public Exchange save(Exchange entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Exchange> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
