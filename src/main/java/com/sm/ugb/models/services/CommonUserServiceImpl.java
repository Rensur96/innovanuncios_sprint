package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.ugb.models.entities.CommonUser;
import com.sm.ugb.models.repository.CommonUserRepository;

@Service
public class CommonUserServiceImpl implements CommonUserService{

	@Autowired
	public CommonUserRepository repository;
	@Override
	public List<CommonUser> findAll() {
		return (List<CommonUser>) repository.findAll();
	}

	@Override
	public CommonUser save(CommonUser entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<CommonUser> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
