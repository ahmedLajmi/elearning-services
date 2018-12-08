package com.inscriptionService.inscriptionService.controller;


import com.inscriptionService.inscriptionService.service.InscriptionService;
import com.inscriptionService.inscriptionService.model.Inscription;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author ahlaj
 */

@RestController
@RequestMapping("/inscriptions")
public class InscriptionResource {
    
    
    private final InscriptionService inscriptionService;

    public InscriptionResource(InscriptionService inscriptionService) {
        this.inscriptionService = inscriptionService;
    }
        
    @GetMapping
    public List<Inscription> findAll() {
        return this.inscriptionService.findAll();
    }

    @GetMapping("/formation/{id}")
    public List<Inscription> findAllByFormation(@PathVariable Long id) {
        return this.inscriptionService.findAllByFormation(id);
    }
    
    @GetMapping("/candidate/{id}")
    public List<Inscription> findAllByCandidate(@PathVariable Long id) {
        return this.inscriptionService.findAllByCandidate(id);
    }

    @GetMapping("/{id}")
    public Inscription findById(@PathVariable Long id) {
        return this.inscriptionService.findById(id);
    }
    
    @PostMapping
    public Inscription create(@PathVariable Inscription inscription) {
        return this.inscriptionService.create(inscription);
    }
    
    @PutMapping
    public Inscription update(@PathVariable Inscription inscription) {
        return this.inscriptionService.update(inscription);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.inscriptionService.delete(id);
    }
}
