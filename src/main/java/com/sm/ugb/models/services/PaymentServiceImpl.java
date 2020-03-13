package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.sm.ugb.models.entities.Payment;
import com.sm.ugb.models.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	public PaymentRepository repository;
	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Payment save(Payment entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	public Optional<Payment> findById(Long id) {
		// TODO Auto-generated method stub
		repository.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
