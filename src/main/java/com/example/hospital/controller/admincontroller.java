package com.example.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping(value = "/admin")
public class admincontroller {
	@Autowired
	private paitentrepository paitentrepo;

	@Autowired
	private doctorrepository doctorrepo;
	
	@Autowired
	private appointmentRepository appointrepo;
	
	
	@RequestMapping(value = "/savepatients", method = RequestMethod.POST)
	public Patient savePatient(@RequestBody Patient patient) {
		//System.out.println(paitentrepo.getFirstName());
		return paitentrepo.save(patient);
	}
	
	
	
	@RequestMapping(value = "/savedoctor", method = RequestMethod.POST)
	public doctor saveDoctor(@RequestBody doctor Doctor) {
		Doctor.setRole("DOCTOR");
		System.out.println(Doctor.getFirst_name()+   Doctor.getLast_name()   +  Doctor.getSpacilization());
	return doctorrepo.save(Doctor);
	}
	
	
	
	@RequestMapping(value = "/patients/{id}", method = RequestMethod.GET)
	public Patient getPatient(@PathVariable("id") int id) {
		return paitentrepo.findById(id).get();
	}
	
	
	@RequestMapping(value = "/doctor/{id}", method = RequestMethod.GET)
	public doctor getDoctor(@PathVariable("id") int id) {
		return doctorrepo.findById(id).get();
	}
	
	
	@RequestMapping(value = "/searchdoctor/{specilization}", method = RequestMethod.GET)
	public doctor getDoctor(@PathVariable("specilization") String specilization) {
		System.out.println(specilization);
		return doctorrepo.findBySpacilizationContaining(specilization);
	}
	
	
	
	@RequestMapping(value = "/patients", method = RequestMethod.GET)
	public List<Patient> getPatients() {
		return paitentrepo.findAll();
	}
	
	
	
	@RequestMapping(value = "/doctors", method = RequestMethod.GET)
	public List<doctor> getDoctors() {
		return doctorrepo.findAll();
	}
	
	
	
	@RequestMapping(value = "/appintment/patients/{id}", method = RequestMethod.GET)
	public appointment getAppointment(@PathVariable("id") int id) {
		
		Patient patient=paitentrepo.findById(id).get();
		System.out.println(patient.getProblem_discription()+"   "+patient.getFirstname());
		doctor doc=doctorrepo.findBySpacilizationContaining(patient.getProblem_discription());
		System.out.println(doc.getSpacilization()+"    "+doc.getFirst_name());
	    appointment appoint= new appointment();  
	    appoint.setPatientId(patient.getId());
	    appoint.setDoctorId(doc.getId());
	    appoint.setTime(null);
	    System.out.println(appoint);
	    
	   return appoint;
	}
	
	
	
	
	@RequestMapping(value = "/appintment/patients/{id}/{time}", method = RequestMethod.GET)
	public appointment getAppointmentTime(@PathVariable("id") int id,@PathVariable("time") String time) {
		
		Patient patient=paitentrepo.findById(id).get();
		System.out.println(patient.getProblem_discription()+"   "+patient.getFirstname());
		doctor doc=doctorrepo.findBySpacilizationContaining(patient.getProblem_discription());
		System.out.println(doc.getSpacilization()+"    "+doc.getFirst_name());
	    appointment appoint= new appointment();  
	    appoint.setPatientId(patient.getId());
	    appoint.setDoctorId(doc.getId());
	    appoint.setTime(time);
	    System.out.println(appoint);
	    
	   return appointrepo.save(appoint);
	}

	
	

	
	@RequestMapping(value = "/appintment", method = RequestMethod.GET)
	public List<appointment> getAllAppointment() {
		
		
	    
	   return appointrepo.findAll();
	}
	
	
	
	
}
