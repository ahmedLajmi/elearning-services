package com.eLearningCommons.eLearningCommons.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormationDto {

    private long id;
    private String name;
    private Date startDate;
    private Date endDate;
    private float price;
    private List<FormerDto> formers;
    private List<InscriptionDto> inscriptions;

}
