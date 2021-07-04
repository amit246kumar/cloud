package com.example.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospital.entity.Patient;

public interface paitentrepository extends JpaRepository<Patient, Integer> {

}
