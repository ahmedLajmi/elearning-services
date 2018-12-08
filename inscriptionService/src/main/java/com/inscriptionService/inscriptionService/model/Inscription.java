package com.inscriptionService.inscriptionService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Inscription {
    @Id
    @GeneratedValue
    
    private long id;
    private Date inscriptionDate;

    private long candidateId;
    private long formationId;

    public Inscription() {
        // empty constructo
    }    
}
