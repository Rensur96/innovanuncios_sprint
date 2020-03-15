package com.sm.ugb.models.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sm.ugb.models.entities.Point;
import com.sm.ugb.models.services.PointService;

@RestController
@RequestMapping("/points")
public class PointController {
	@Autowired
	private PointService pointsCtrl;
		
	@RequestMapping(path="/u-points", method = RequestMethod.GET)
	public List<Point> getList(){
		return (List<Point>) pointsCtrl.findAll();
	}
	
	@RequestMapping(path="/u-points/{id}", method = RequestMethod.GET)
	public Point getById(@PathVariable("id") Long id){
		Optional<Point> result =  pointsCtrl.findById(id);
		return result.get();
	}
	
	@RequestMapping(path = "/u-points", method = RequestMethod.POST)
	public Point saveUser(@RequestBody Point entity){
		return (Point) pointsCtrl.save(entity);
	}
	
	@RequestMapping(path = "/u-pointsDel/{id}", method = RequestMethod.GET)
	public void deleteUser(@PathVariable("id") Long id){
		pointsCtrl.delete(id);
	}
}
