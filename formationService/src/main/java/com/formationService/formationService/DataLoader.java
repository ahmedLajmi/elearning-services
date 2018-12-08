package com.formationService.formationService;

import com.eLearningCommons.eLearningCommons.commons.dto.CandidateDto;
import com.eLearningCommons.eLearningCommons.commons.dto.InscriptionDto;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



@Slf4j
@Component
public class DataLoader implements CommandLineRunner{
    private final RestTemplate restTemplate;

    public DataLoader(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        ResponseEntity<CandidateDto> candidateResponseEntity
                = this.restTemplate.getForEntity(
                "http://candidate-service/candidate/{id}",
                CandidateDto.class,
                2
        );
        
        ResponseEntity<InscriptionDto> inscriptionResponseEntity
                = this.restTemplate.getForEntity(
                "http://inscription-service/inscription/{id}",
                InscriptionDto.class,
                2
        );
    }
}
