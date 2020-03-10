package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sm.ugb.models.entities.Reward;
import com.sm.ugb.models.repository.RewardRepository;;

public class RewardServiceImpl {
	@Autowired
	public RewardRepository repository;
	
	public List<Reward> findAll() {
		return (List<Reward>)repository.findAll();
	}

	public Reward save(Reward entity) {
		return repository.save(entity);
	}

	public Optional<Reward> findById(Long id) {
		return repository.findById(id);
	}

	public void delete(Reward entity) {
	repository.delete(entity);
	}
}
