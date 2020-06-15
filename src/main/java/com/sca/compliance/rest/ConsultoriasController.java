package com.sca.compliance.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sca.compliance.model.Consultoria;
import com.sca.compliance.repository.ConsultoriaRepository;
import com.sca.compliance.service.ConsultoriaService;

@RestController
@RequestMapping("/consultorias")
public class ConsultoriasController {
	
	@Autowired
	private ConsultoriaService consultoriaService;
	
	@Autowired
	private ConsultoriaRepository consultoriaRepository;
	
	@GetMapping
	public List<Consultoria> getAllConsultorias(){
		return consultoriaService.findAll();
	}
	
	@GetMapping("{id}")
	public Consultoria getConsumoInsumo(@PathVariable Long id) {
		return consultoriaRepository.getOne(id);
	}

}
