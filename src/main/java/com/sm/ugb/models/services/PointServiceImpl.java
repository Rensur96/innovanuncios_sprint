package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.ugb.models.entities.Point;
import com.sm.ugb.models.repository.PointRepository;

@Service
public class PointServiceImpl implements PointService {
	@Autowired
	public PointRepository repository;
	
	public List<Point> findAll() {
		return (List<Point>)repository.findAll();
	}

	public Point save(Point entity) {
		return repository.save(entity);
	}

	public Optional<Point> findById(Long id) {
		return repository.findById(id);
	}

	public void delete(Long id) {
	repository.deleteById(id);	
	}
}
