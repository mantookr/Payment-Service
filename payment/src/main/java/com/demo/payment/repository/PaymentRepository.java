package com.demo.payment.repository;

import com.demo.payment.entity.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment,Integer> {

}
