package com.sm.ugb.models.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sm.ugb.models.entities.Payment;
import com.sm.ugb.models.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	@Autowired
	private PaymentService PaymentCtrl;
		
	@RequestMapping(path="/payments", method = RequestMethod.GET)
	public List<Payment> getList(){
		return (List<Payment>) PaymentCtrl.findAll();
	}
	
	@RequestMapping(path="/payment/{id}", method = RequestMethod.GET)
	public Payment getById(@PathVariable("id") Long id){
		Optional<Payment> result =  PaymentCtrl.findById(id);
		return result.get();
	}
	
	@RequestMapping(path = "/regPayment", method = RequestMethod.POST)
	public Payment regPayment(@RequestBody Payment entity){
		return (Payment) PaymentCtrl.save(entity);
	}
	
	@RequestMapping(path = "/delPayment/{id}", method = RequestMethod.GET)
	public void deletePayment(@PathVariable("id") Long id){
		PaymentCtrl.delete(id);
	}
}