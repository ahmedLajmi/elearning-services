package com.formationService.formationService.service;


import com.formationService.formationService.domain.Former;
import com.formationService.formationService.repository.FormerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FormerService {
   
   private final FormerRepository formerRepository;

    public FormerService(FormerRepository formerRepository) {
        this.formerRepository = formerRepository;
    }
    public Former create(Former former) {
        return this.formerRepository.save(former);
    }
    
    public List<Former> findAll() {
        return this.formerRepository.findAll();
    }
    public Former findById(long id) {
        return this.formerRepository.findById(id).orElse(null);
    }
    
    public void delete(long id) {
        this.formerRepository.deleteById(id);
    }
    
    public Former update(Former former) {
        return this.formerRepository.save(former);
    }
}

