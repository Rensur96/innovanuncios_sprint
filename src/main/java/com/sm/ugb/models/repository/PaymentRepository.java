package com.sm.ugb.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.sm.ugb.models.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long>{

}
