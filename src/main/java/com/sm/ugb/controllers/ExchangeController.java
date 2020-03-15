package com.sm.ugb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



public class ExchangeController {
		private ExchangeController ExchangeControllerCtrl;
		
		@RequestMapping(value="/ExchangeController", method = RequestMethod.GET)
		public List<ExchangeController> getList(){
			return (List<ExchangeController>) ExchangeControllerCtrl.findAll();
		}
		
		private List<ExchangeController> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@RequestMapping(value="/Exchange/{id}", method = RequestMethod.GET)
		public Exchange getById(@PathVariable("id") Long id){
			Optional<Exchange> result =  Exchange.getById(id);
			return result.get();
		}
		
		@RequestMapping(value="/Exchange", method = RequestMethod.POST)
		public ExchangeController saveUser(@RequestBody ExchangeController entity){
			return (ExchangeController) ExchangeControllerCtrl.saveUser(entity);
		}
		
		@RequestMapping(value="/Exchange/{id}", method = RequestMethod.GET)
		public void deleteUser(@PathVariable("id") Long id){
			ExchangeControllerCtrl.deleteUser(id);
		}
}
