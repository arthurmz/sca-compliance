package com.sca.compliance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.compliance.model.Consultoria;
import com.sca.compliance.repository.ConsultoriaRepository;


@Service
public class ConsultoriaService {
	
	@Autowired
	private ConsultoriaRepository consultoriaRepository;
	
	@Transactional
	public Consultoria saveAquisicaoInsumo(Consultoria aquisicaoInsumo) {
		Consultoria a = consultoriaRepository.save(aquisicaoInsumo);
		 return a;
	}
	
	public List<Consultoria> findAll() {
		return consultoriaRepository.findAll();
	}

}
