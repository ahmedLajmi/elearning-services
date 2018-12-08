package com.candidateService.candidateService.controller;

import com.candidateService.candidateService.model.Candidate;
import com.candidateService.candidateService.service.CandidateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/candidates")
public class CandidateResource {

    private final CandidateService candidateService;

    public CandidateResource(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping()
    public List<Candidate> findAll() {
        return this.candidateService.findAll();
    }

    @GetMapping("/{id}")
    public Candidate findById(@PathVariable Long id) {
        return this.candidateService.findById(id);
    }
    
    @PostMapping
    public Candidate create(@PathVariable Candidate candidate) {
        return this.candidateService.create(candidate);
    }
    @PutMapping
    public Candidate update(@PathVariable Candidate candidate) {
        return this.candidateService.update(candidate);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.candidateService.delete(id);
    }
}
