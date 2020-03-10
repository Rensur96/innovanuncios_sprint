package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import com.sm.ugb.models.entities.CommonUser;

public interface CommonUserService {
	
	public List<CommonUser> findAll();
	
	public CommonUser save(CommonUser entity);
	
	public Optional<CommonUser> findById(Long id);
	
	public void delete(CommonUser entity);
	
}