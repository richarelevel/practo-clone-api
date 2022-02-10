package com.api.practoclone.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.practoclone.model.Specialization;
import com.api.practoclone.repository.SpecializationRepository;

@RestController
public class SpecializationController {
	
	private final SpecializationRepository repository;

	SpecializationController(SpecializationRepository repository) {
	    this.repository = repository;
	  }
	
	@PostMapping("/specializations/add")
	Specialization newSpecialization(@RequestBody Specialization newSpecialization) {
	    return repository.save(newSpecialization);
	  }

}
