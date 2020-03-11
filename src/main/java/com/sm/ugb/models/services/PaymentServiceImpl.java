package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.ugb.models.entities.Payment;
import com.sm.ugb.models.repository.PaymentRepository;

@Service
public class PaymentServiceImpl {

	@Autowired
	public PaymentRepository repository;
	
	public List<Payment> findAll() {
		return (List<Payment>)repository.findAll();
	}

	public Payment save(Payment entity) {
		return repository.save(entity);
	}

	public Optional<Payment> findById(Long id) {
		return repository.findById(id);
	}

	public void delete(Long id) {
	repository.deleteById(id);
	}

	
}
