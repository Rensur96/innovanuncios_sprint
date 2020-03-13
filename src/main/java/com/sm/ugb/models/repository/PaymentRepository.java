package com.sm.ugb.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sm.ugb.models.entities.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long>{

}
