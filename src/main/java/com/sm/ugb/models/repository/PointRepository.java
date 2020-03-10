package com.sm.ugb.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sm.ugb.models.entities.Point;

@Repository
public interface PointRepository extends CrudRepository<Point, Long>{

}
