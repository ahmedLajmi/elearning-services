package com.eLearningCommons.eLearningCommons.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InscriptionDto {

    private long id;
    private Date inscriptionDate;
    private CandidateDto condidate;
    private FormationDto formation;
}
