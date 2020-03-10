package com.sm.ugb.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sm.ugb.models.entities.Reward;

@Repository
public interface RewardRepository extends CrudRepository<Reward, Long>{

}
