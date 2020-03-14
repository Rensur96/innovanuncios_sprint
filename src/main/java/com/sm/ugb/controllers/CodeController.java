package com.sm.ugb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sm.ugb.models.entities.Code;

public class CodeController {
	private CodeController CodeControllerCtrl;
	
	@RequestMapping(value="/CodeController", method = RequestMethod.GET)
	public List<CodeController> getList(){
		return (List<CodeController>) CodeControllerCtrl.findAll();
	}
	
	private List<CodeController> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value="/advertiser/{id}", method = RequestMethod.GET)
	public Code getById(@PathVariable("id") Long id){
		Optional<Code> result =  Code.getById(id);
		return result.get();
	}
	
	@RequestMapping(value="/Code", method = RequestMethod.POST)
	public CodeController saveUser(@RequestBody CodeController entity){
		return (CodeController) CodeControllerCtrl.saveUser(entity);
	}
	
	@RequestMapping(value="/Code/{id}", method = RequestMethod.GET)
	public void deleteUser(@PathVariable("id") Long id){
		CodeControllerCtrl.deleteUser(id);
	}
}
