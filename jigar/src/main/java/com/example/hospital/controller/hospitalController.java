package com.example.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.model.Patient;
import com.example.hospital.service.PatientService;



@RestController
@CrossOrigin(origins = "*")
public class hospitalController {

    // A simple GET request with a query parameter
	@Autowired
	 private PatientService patientService;

	    @PostMapping("/register")
	    public ResponseEntity<Patient> registerPatient(@RequestBody Patient patient) {
	    	System.out.println("Hello");
	        Patient registeredPatient = patientService.registerPatient(patient);
	        return new ResponseEntity<>(registeredPatient,HttpStatus.CREATED);
	    }
}

