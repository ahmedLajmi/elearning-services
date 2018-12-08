package com.inscriptionService.inscriptionService.controller;


import com.inscriptionService.inscriptionService.service.PaymentService;
import com.inscriptionService.inscriptionService.model.Payment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author ahlaj
 */

@RestController
@RequestMapping("/payments")
public class PaymentResource {
    
    private final PaymentService paymentService;

    public PaymentResource(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
    @GetMapping
    public List<Payment> findAll() {
        return this.paymentService.findAll();
    }

    @GetMapping("/inscription/{id}")
    public List<Payment> findAllByInscription(@PathVariable Long id) {
        return this.paymentService.findByInscription(id);
    }

    @GetMapping("/{id}")
    public Payment findById(@PathVariable Long id) {
        return this.paymentService.findById(id);
    }
    
    @PostMapping
    public Payment create(@PathVariable Payment payment) {
        return this.paymentService.create(payment);
    }
    
    @PutMapping
    public Payment update(@PathVariable Payment payment) {
        return this.paymentService.update(payment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.paymentService.delete(id);
    }

}
