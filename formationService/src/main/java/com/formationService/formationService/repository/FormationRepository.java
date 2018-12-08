package com.formationService.formationService.repository;

import com.formationService.formationService.domain.Formation;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long>{
    List<Formation> findByName(String name);
}
