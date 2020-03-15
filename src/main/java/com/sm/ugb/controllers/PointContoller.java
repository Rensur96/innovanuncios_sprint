package com.sm.ugb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sm.ugb.models.entities.Advertiser;

public class PointContoller {

		@Autowired
		private PointContoller  PointCtrl;
			
		@RequestMapping(value="/Pointr", method = RequestMethod.GET)
		public List<Point> getList(){
			return (List<Point>) PointCtrl.findAll();
		}
		
		private List<Point> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@RequestMapping(value="/Point/{id}", method = RequestMethod.GET)
		public Point getById(@PathVariable("id") Long id){
			Optional<Point> result =  PointContoller .getByid(id);
			return result.get();
		}
		
		@RequestMapping(value="/Point ", method = RequestMethod.POST)
		public PointContoller  saveUser(@RequestBody Point entity){
			return (PointContoller ) Point.saveUser(entity);
		}
		
		@RequestMapping(value="/Point/{id}", method = RequestMethod.GET)
		public void deleteUser(@PathVariable("id") Long id){
			PointCtrl.deleteUser(id);
		}
}
