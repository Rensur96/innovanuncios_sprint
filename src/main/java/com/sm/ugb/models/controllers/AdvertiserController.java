package com.sm.ugb.models.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sm.ugb.models.entities.Advertiser;
import com.sm.ugb.models.services.AdvertiserService;

@RestController
@RequestMapping("/advertiser")
public class AdvertiserController {
	@Autowired
	private AdvertiserService advertiserCtrl;
		
	@RequestMapping(path="/advertisers", method = RequestMethod.GET)
	public List<Advertiser> getList(){
		return (List<Advertiser>) advertiserCtrl.findAll();
	}
	
	@RequestMapping(path="/advertiser/{id}", method = RequestMethod.GET)
	public Advertiser getById(@PathVariable("id") Long id){
		Optional<Advertiser> result =  advertiserCtrl.findById(id);
		return result.get();
	}
	
	@RequestMapping(path = "/addAdvertiser", method = RequestMethod.POST)
	public Advertiser addAdvertiser(@RequestBody Advertiser entity){
		return (Advertiser) advertiserCtrl.save(entity);
	}
	
	@RequestMapping(path = "/delAdvertiser/{id}", method = RequestMethod.GET)
	public void deleteAdvertiser(@PathVariable("id") Long id){
		advertiserCtrl.delete(id);
	}
}
