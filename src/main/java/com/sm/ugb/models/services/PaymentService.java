package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import com.sm.ugb.models.entities.Payment;
<<<<<<< HEAD

public interface PaymentService {
=======

public interface PaymentService {

>>>>>>> 629e1f38ade34cba13e12a78bde5d9b84e09a5a3
	
	public List<Payment> findAll();
	
	public Payment save(Payment entity);
	
	public Optional<Payment> findById(Long id);
	
	public void delete(Long id);
<<<<<<< HEAD
	
}
=======
}
>>>>>>> 629e1f38ade34cba13e12a78bde5d9b84e09a5a3
