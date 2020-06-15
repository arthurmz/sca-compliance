package com.sca.compliance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.compliance.model.Consultoria;

@Repository
public interface ConsultoriaRepository extends JpaRepository<Consultoria, Long>{

}
