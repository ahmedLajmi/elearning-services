package com.eLearningCommons.eLearningCommons.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormerDto {

    private long id;
    private String firstName;
    private String lastName;
    private long telephone;
    private String email;
    private List<FormationDto> formations ;
}
