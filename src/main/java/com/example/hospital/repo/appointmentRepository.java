package com.example.hospital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.hospital.entity.appointment;
import com.example.hospital.entity.doctor;

public interface appointmentRepository extends JpaRepository<appointment, Integer> {
	 @Query(value = "SELECT * from appointment a where a.doctor_Id =:id", nativeQuery = true)
	List<appointment> findPatientIdBydoctorId(@Param("id") int id );
	 @Query(value = "SELECT * from appointment a where a.patient_Id =:id", nativeQuery = true)
	List<appointment> findDoctorIdBypaitentId(int id);
}
