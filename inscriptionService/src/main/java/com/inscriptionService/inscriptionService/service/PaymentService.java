package com.inscriptionService.inscriptionService.service;


import com.inscriptionService.inscriptionService.repository.PaymentRepository;
import com.inscriptionService.inscriptionService.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author ahlaj
 */

@Service
public class PaymentService {
    
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }
    
    public Payment findById(long id) {
        return this.paymentRepository.findById(id).orElse(null);
    }

    public List<Payment> findByInscription(long id) {
        return this.paymentRepository.findByInscriptionId(id);
    }
    
    public Payment create(Payment payment) {
        return this.paymentRepository.save(payment);
    }
    
    public Payment update(Payment payment) {
        return this.paymentRepository.save(payment);
    }
    
    public List<Payment> findAll() {
        return this.paymentRepository.findAll();
    }
    
    public void delete(Long id) {
        this.paymentRepository.deleteById(id);
    }
}
