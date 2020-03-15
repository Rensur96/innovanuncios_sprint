package com.sm.ugb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController;

import com.sm.ugb.models.entities.Advertiser;
//import com.sm.ugb.models.services.AdvertiserService;

@RestController
@RequestMapping("/advertiser")
public class AdvertiserController {
	@Autowired
	private AdvertiserController advertiserCtrl;
		
	@RequestMapping(value="/advertiser", method = RequestMethod.GET)
	public List<Advertiser> getList(){
		return (List<Advertiser>) advertiserCtrl.findAll();
	}
	
	private List<Advertiser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value="/advertiser/{id}", method = RequestMethod.GET)
	public Advertiser getById(@PathVariable("id") Long id){
		Optional<Advertiser> result =  Advertiser.getByid(id);
		return result.get();
	}
	
	@RequestMapping(value="/rewards", method = RequestMethod.POST)
	public Advertiser saveUser(@RequestBody Advertiser entity){
		return (Advertiser) advertiserCtrl.saveUser(entity);
	}
	
	@RequestMapping(value="/rewards/{id}", method = RequestMethod.GET)
	public void deleteUser(@PathVariable("id") Long id){
		advertiserCtrl.deleteUser(id);
	}
}
 
 
