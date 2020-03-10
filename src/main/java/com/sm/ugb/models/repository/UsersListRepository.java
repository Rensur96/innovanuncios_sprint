package com.sm.ugb.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sm.ugb.models.entities.UsersList;

@Repository
public interface UsersListRepository extends CrudRepository<UsersList, Long>{
	
}
