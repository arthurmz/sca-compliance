package com.sca.compliance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.compliance.model.NormaAmbiental;

@Repository
public interface NormaAmbientalRepository extends JpaRepository<NormaAmbiental, Long>{

}
