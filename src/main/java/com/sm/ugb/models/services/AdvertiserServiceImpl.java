package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.sm.ugb.models.entities.Advertiser;
import com.sm.ugb.models.repository.AdvertiserRepository;

@Service
public class AdvertiserServiceImpl implements AdvertiserService{

	@Autowired
	public AdvertiserRepository repository;
	@Override
	public List<Advertiser> findAll() {
		return (List<Advertiser>)repository.findAll();
	}

	@Override
	public Advertiser save(Advertiser entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Advertiser> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Advertiser entity) {
		repository.delete(entity);
	}

}
