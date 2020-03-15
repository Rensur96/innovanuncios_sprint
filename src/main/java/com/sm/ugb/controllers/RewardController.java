package com.sm.ugb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sm.models.entities.Reward;
import com.sm.ugb.models.entities.Advertiser;

public class RewardController {
	
		@Autowired
		private  RewardController  RewardCtrl;
			
		@RequestMapping(value="/ Rewardr", method = RequestMethod.GET)
		public List< Reward> getList(){
			return (List< Reward>)  RewardCtrl.findAll();
		}
		
		private List< Reward> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@RequestMapping(value="/ Reward/{id}", method = RequestMethod.GET)
		public  Reward getById(@PathVariable("id") Long id){
			Optional<Reward> result =  Reward.getByid(id);
			return result.get();
		}
		
		@RequestMapping(value="/ Reward", method = RequestMethod.POST)
		public  Reward saveUser(@RequestBody  Reward entity){
			return ( Reward)  RewardCtrl.saveUser(entity);
		}
		
		@RequestMapping(value="/ Reward/{id}", method = RequestMethod.GET)
		public void deleteUser(@PathVariable("id") Long id){
			 RewardCtrl.deleteUser(id);
		}
}
