package com.payment.repository;

import com.payment.dto.PaymentDto;
import com.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    Payment findByUserEmail(String email);
}