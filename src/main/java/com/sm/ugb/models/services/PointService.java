package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import com.sm.ugb.models.entities.Point;

public interface PointService {
	public List<Point> findAll();
	
	public Point save(Point entity);
	
	public Optional<Point> findById(Long id);
	
	public void delete(Point entity);
}
