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
@RequestMapping(value = "/doctor")
public class DoctorController {
	@Autowired
	private paitentrepository paitentrepo;

	@Autowired
	private doctorrepository doctorrepo;
	
	@Autowired
	private appointmentRepository appointrepo;
	
	@RequestMapping(value = "/findall/{id}", method = RequestMethod.GET)
	public List<appointment> getPatients(@PathVariable("id") int id) {
		
		doctor doc=doctorrepo.findById(id).get();
		System.out.println(doc);
		return appointrepo.findPatientIdBydoctorId(doc.getId());
	}
	
	@RequestMapping(value = "/patients/{id}", method = RequestMethod.GET)
	public Patient getPatient(@PathVariable("id") int id) {
		return paitentrepo.findById(id).get();
	}

}