package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import com.sm.ugb.models.entities.Payment;

public interface PaymentService {
	
	public List<Payment> findAll();
	
	public Payment save(Payment entity);
	
	public Optional<Payment> findById(Long id);
	
	public void delete(Long id);
	
}