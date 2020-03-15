package com.sm.ugb.models.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sm.ugb.models.entities.CommonUser;
import com.sm.ugb.models.services.CommonUserService;

@RestController
@RequestMapping("/comUser")
public class CommonUserController {
	@Autowired
	private CommonUserService comUserCtrl;
		
	@RequestMapping(path="/exchanges", method = RequestMethod.GET)
	public List<CommonUser> getList(){
		return (List<CommonUser>) comUserCtrl.findAll();
	}
	
	@RequestMapping(path="/exchanges/{id}", method = RequestMethod.GET)
	public CommonUser getById(@PathVariable("id") Long id){
		Optional<CommonUser> result =  comUserCtrl.findById(id);
		return result.get();
	}
	
	@RequestMapping(path = "/regExchanges", method = RequestMethod.POST)
	public CommonUser saveUser(@RequestBody CommonUser entity){
		return (CommonUser) comUserCtrl.save(entity);
	}
	
	@RequestMapping(path = "/delExchanges/{id}", method = RequestMethod.GET)
	public void deleteUser(@PathVariable("id") Long id){
		comUserCtrl.delete(id);
	}
}
