package com.formationService.formationService.service;


import com.formationService.formationService.domain.Formation;
import com.formationService.formationService.repository.FormationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FormationService {
    private final FormationRepository formationRepository;

    public FormationService (FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }
    public Formation create (Formation formation) {
        return this.formationRepository.save(formation);
    }
    
    public List<Formation> findAll() {
        return this.formationRepository.findAll();
    }
    public Formation findById(long id) {
        return this.formationRepository.findById(id).orElse(null);
    }
   
    public void delete(long id) {
        this.formationRepository.deleteById(id);
    }
    
    public Formation update (Formation formation) {
        return this.formationRepository.save(formation);
    }
}
