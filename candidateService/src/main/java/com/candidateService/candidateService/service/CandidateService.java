package com.candidateService.candidateService.service;

import com.candidateService.candidateService.model.Candidate;
import com.candidateService.candidateService.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> findAll() {
        return this.candidateRepository.findAll();
    }

    public Candidate create(Candidate candidate) {
        return this.candidateRepository.save(candidate);
    }
    
    public Candidate update(Candidate candidate) {
        return this.candidateRepository.save(candidate);
    }
    

    public Candidate findById(long id) {
        return this.candidateRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        this.candidateRepository.deleteById(id);
    }

}
