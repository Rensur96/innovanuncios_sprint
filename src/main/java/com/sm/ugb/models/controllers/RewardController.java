package com.sm.ugb.models.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sm.ugb.models.entities.Reward;
import com.sm.ugb.models.services.RewardService;

@RestController
@RequestMapping("/advertiser")
public class RewardController {
	@Autowired
	private RewardService rewardCtrl;
		
	@RequestMapping(value="/rewards", method = RequestMethod.GET)
	public List<Reward> getList(){
		return (List<Reward>) rewardCtrl.findAll();
	}
	
	@RequestMapping(value="/rewards/{id}", method = RequestMethod.GET)
	public Reward getById(@PathVariable("id") Long id){
		Optional<Reward> result =  rewardCtrl.findById(id);
		return result.get();
	}
	
	@RequestMapping(value="/rewards", method = RequestMethod.POST)
	public Reward saveUser(@RequestBody Reward entity){
		return (Reward) rewardCtrl.save(entity);
	}
	
	@RequestMapping(value="/rewards/{id}", method = RequestMethod.GET)
	public void deleteUser(@PathVariable("id") Long id){
		rewardCtrl.delete(id);
	}
}
