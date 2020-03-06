package com.sm.ugb.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sm.ugb.models.entities.Advertiser;

@Repository
public interface AdvertiserRepository extends CrudRepository<Advertiser, Long> {

}
