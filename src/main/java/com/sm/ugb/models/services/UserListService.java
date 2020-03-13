package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import com.sm.ugb.models.entities.UsersList;;

public interface UserListService {
public List<UsersList> findAll();
	
	public UsersList save(UsersList entity);
	
	public Optional<UsersList> findById(Long id);
	
	public void delete(Long id);
}
