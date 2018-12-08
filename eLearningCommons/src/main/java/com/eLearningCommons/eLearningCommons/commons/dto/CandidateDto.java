package com.eLearningCommons.eLearningCommons.commons.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDto {

    private long id;
    private String familyName;
    private String name;
    private long phone;
    private String email;
    private List<InscriptionDto> inscriptions;

}
