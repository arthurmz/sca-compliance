package com.sca.compliance.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sca.compliance.model.NormaAmbiental;
import com.sca.compliance.repository.NormaAmbientalRepository;
import com.sca.compliance.service.NormaAmbientalService;

@RestController
@RequestMapping("/normasAmbientais")
public class NormaAmbientalController {
	
	@Autowired
	private NormaAmbientalService normaAmbientalService;
	
	@Autowired
	private NormaAmbientalRepository normaAmbientalRepository;
	
	@GetMapping
	public List<NormaAmbiental> getAllNormasAmbientais(){
		return normaAmbientalService.findAll();
	}
	
	@GetMapping("{id}")
	public NormaAmbiental getNormaAmbiental(@PathVariable Long id) {
		return normaAmbientalRepository.getOne(id);
	}

}
