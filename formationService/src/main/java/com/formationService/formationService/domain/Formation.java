package com.formationService.formationService.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "formation")
public class Formation {
    @Id
    @GeneratedValue
    private long idFormation;
    
    private long idInscription;
    private long idCandidate;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "price")
    private float price;

    @ManyToMany
    private List<Former> formers;

    public Formation() {
        //empty constructure
    }
}
