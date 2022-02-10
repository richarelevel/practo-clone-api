package com.api.practoclone.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.practoclone.model.Doctor;
import com.api.practoclone.repository.DoctorRepository;

@RestController
public class DoctorController {
	
	private final DoctorRepository repository;

	DoctorController(DoctorRepository repository) {
	    this.repository = repository;
	  }
	
	@PostMapping("/doctors/add")
	  Doctor newDoctor(@RequestBody Doctor newDoctor) {
	    return repository.save(newDoctor);
	  }

}
