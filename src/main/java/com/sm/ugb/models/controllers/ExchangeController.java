package com.sm.ugb.models.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sm.ugb.models.entities.Exchange;
import com.sm.ugb.models.services.ExchangeService;

@RestController
@RequestMapping("/exchanges")
public class ExchangeController {
	@Autowired
	private ExchangeService exchangeCtrl;
		
	@RequestMapping(path="/exchanges", method = RequestMethod.GET)
	public List<Exchange> getList(){
		return (List<Exchange>) exchangeCtrl.findAll();
	}
	
	@RequestMapping(path="/exchanges/{id}", method = RequestMethod.GET)
	public Exchange getById(@PathVariable("id") Long id){
		Optional<Exchange> result =  exchangeCtrl.findById(id);
		return result.get();
	}
	
	@RequestMapping(path = "/regExchanges", method = RequestMethod.POST)
	public Exchange regExchange(@RequestBody Exchange entity){
		return (Exchange) exchangeCtrl.save(entity);
	}
	
	@RequestMapping(path = "/delExchanges/{id}", method = RequestMethod.GET)
	public void deleteExchange(@PathVariable("id") Long id){
		exchangeCtrl.delete(id);
	}
}
