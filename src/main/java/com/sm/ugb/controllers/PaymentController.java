package com.sm.ugb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sm.ugb.models.entities.Advertiser;
import com.sm.ugb.models.entities.Payment;

public class PaymentController {
	private PaymentController PaymentControllerCrtl;
	
	@RequestMapping(value="/PaymentController", method = RequestMethod.GET)
	public List<Payment> getList(){
		return (List<Payment>) PaymentControllerCrtl.findAll();
	}
	
	private List<Payment> findAll() {
		
		return null;
	}

	@RequestMapping(value="/Paymentr/{id}", method = RequestMethod.GET)
	public Payment getById(@PathVariable("id") Long id){
		Optional<Payment> result =  Payment.getByid(id);
		return result.get();
	}
	
	@RequestMapping(value="/Paymentr", method = RequestMethod.POST)
	public static Payment saveUser(@RequestBody Advertiser entity){
		return (Payment) PaymentController.saveUser(entity);
	}
	
	@RequestMapping(value="/rewards/{id}", method = RequestMethod.GET)
	public void deleteUser(@PathVariable("id") Long id){
		Payment.deleteUser(id);
	}
}
 
