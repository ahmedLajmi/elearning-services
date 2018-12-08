package com.inscriptionService.inscriptionService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.inscriptionService.inscriptionService.model.Inscription;

import java.util.List;

/**
 *
 * @author Ahmed
 */


@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {

    List<Inscription> findByFormationId(long formationId);
    List<Inscription> findByCandidateId(long CandidateId);
}
