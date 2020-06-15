package com.sca.compliance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.compliance.model.NormaAmbiental;
import com.sca.compliance.repository.NormaAmbientalRepository;


@Service
public class NormaAmbientalService {
	
	@Autowired
	private NormaAmbientalRepository normaAmbientalRepository;
	
	@Transactional
	public NormaAmbiental saveAquisicaoInsumo(NormaAmbiental normaAmbiental) {
		NormaAmbiental a = normaAmbientalRepository.save(normaAmbiental);
		return a;
	}
	
	public List<NormaAmbiental> findAll() {
		return normaAmbientalRepository.findAll();
	}

}
