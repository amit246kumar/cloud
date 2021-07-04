package com.example.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.entity.Patient;
import com.example.hospital.entity.appointment;
import com.example.hospital.entity.doctor;
import com.example.hospital.repo.appointmentRepository;
import com.example.hospital.repo.doctorrepository;
import com.example.hospital.repo.paitentrepository;

@RestController
@RequestMapping(value = "/patient")
public class patientController {
	@Autowired
	private paitentrepository paitentrepo;

	@Autowired
	private doctorrepository doctorrepo;
	
	@Autowired
	private appointmentRepository appointrepo;
	//search doctor by id
	
	@RequestMapping(value = "/doctor/{id}", method = RequestMethod.GET)
	public doctor getDoctor(@PathVariable("id") int id) {
		return doctorrepo.findById(id).get();
		
	}
	
	// get details of his appointment
	
	
	@RequestMapping(value = "/findall/{id}", method = RequestMethod.GET)
	public List<appointment> getPatients(@PathVariable("id") int id) {
		
		Patient  pat=paitentrepo.findById(id).get();
		System.out.println(pat);
		return appointrepo.findDoctorIdBypaitentId(pat.getId());
	}
	

}
