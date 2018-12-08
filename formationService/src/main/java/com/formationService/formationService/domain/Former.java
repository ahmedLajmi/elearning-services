package com.formationService.formationService.domain;

import org.hibernate.validator.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "former")
public class Former {
   @Id
   @GeneratedValue
   private long idFormer;
   
   @Column(name = "first_name")
   private String firstName;
   
   @Column(name = "last_name")
   private String lastName;
   
   @Column(name = "telephone")
   private long telephone;
   
   @Email
   @Column(name = "email")
   private String email;
   
   @ManyToMany
   @JoinTable(joinColumns = @JoinColumn(name = "idFormer"), inverseJoinColumns = @JoinColumn(name = "idFormation") )
    private List<Formation> formations = new ArrayList<>();

    public Former() {
        // Empty constructor
    }

}
