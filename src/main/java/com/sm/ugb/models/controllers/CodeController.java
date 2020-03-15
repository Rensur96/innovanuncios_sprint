package com.sm.ugb.models.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sm.ugb.models.entities.Code;
import com.sm.ugb.models.services.CodeService;

@RestController
@RequestMapping("/codes")
public class CodeController {
	@Autowired
	private CodeService codeCtrl;
		
	@RequestMapping(path="/codes", method = RequestMethod.GET)
	public List<Code> getList(){
		return (List<Code>) codeCtrl.findAll();
	}
	
	@RequestMapping(path="/codes/{id}", method = RequestMethod.GET)
	public Code getById(@PathVariable("id") Long id){
		Optional<Code> result =  codeCtrl.findById(id);
		return result.get();
	}
	
	@RequestMapping(path = "/regCode", method = RequestMethod.POST)
	public Code regCode(@RequestBody Code entity){
		return (Code) codeCtrl.save(entity);
	}
	
	@RequestMapping(path = "/delCode/{id}", method = RequestMethod.GET)
	public void deleteCode(@PathVariable("id") Long id){
		codeCtrl.delete(id);
	}
}
