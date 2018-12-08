package com.inscriptionService.inscriptionService.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.util.Objects;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Payment {

    @Id
    @GeneratedValue
    private long id;

    private float amount;
    
    @ManyToOne
    @JoinColumn(name="idInscription")
    private Inscription inscription;


    public Payment() {
        // empty constructor
    }

}
