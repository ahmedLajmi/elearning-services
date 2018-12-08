package com.eLearningCommons.eLearningCommons.commons.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {

    private long id;
    private float amount;
    private InscriptionDto inscription;
}
