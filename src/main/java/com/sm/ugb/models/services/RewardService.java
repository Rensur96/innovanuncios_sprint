package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import com.sm.ugb.models.entities.Reward;

public interface RewardService {
public List<Reward> findAll();
	
	public Reward save(Reward entity);
	
	public Optional<Reward> findById(Long id);
	
	public void delete(Reward entity);
}
