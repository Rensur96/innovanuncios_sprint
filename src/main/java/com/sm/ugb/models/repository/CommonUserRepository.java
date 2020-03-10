package com.sm.ugb.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sm.ugb.models.entities.CommonUser;

@Repository
public interface CommonUserRepository extends CrudRepository<CommonUser, Long>{

}
