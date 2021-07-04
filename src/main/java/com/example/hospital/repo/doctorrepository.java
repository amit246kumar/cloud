package com.example.hospital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospital.entity.doctor;
//import com.iqvia.clinicals.api.model.Patient;

public interface doctorrepository extends JpaRepository<doctor, Integer> {
doctor findBySpacilizationContaining(String specilization);

}
