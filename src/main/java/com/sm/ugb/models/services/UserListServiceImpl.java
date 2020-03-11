package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.ugb.models.entities.UsersList;
import com.sm.ugb.models.repository.UsersListRepository;

@Service
public class UserListServiceImpl {
	@Autowired
	public UsersListRepository repository;
	
	public List<UsersList> findAll() {
		return (List<UsersList>)repository.findAll();
	}

	public UsersList save(UsersList entity) {
		return repository.save(entity);
	}

	public Optional<UsersList> findById(Long id) {
		return repository.findById(id);
	}

	public void delete(Long id) {
	repository.deleteById(id);	
	}
}
