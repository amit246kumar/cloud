package com.example.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class appointment {
	@Id
	private int id;
	//@Column(name="patId")
	private int patient_Id;
	//@Column(name="docid")
	private int doctor_Id;
	//@Column(name="Timeapp")
	private String Timeapp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatientId() {
		return patient_Id;
	}
	public void setPatientId(int patientId) {
		this.patient_Id = patientId;
	}
	public int getDoctorId() {
		return doctor_Id;
	}
	public void setDoctorId(int doctorId) {
		this.doctor_Id = doctorId;
	}
	public String getTime() {
		return Timeapp;
	}
	public void setTime(String time) {
		Timeapp = time;
	}
	@Override
	public String toString() {
		return "appointment [id=" + id + ", patientId=" + patient_Id + ", doctorId=" + doctor_Id + ", Timeapp=" + Timeapp
				+ "]";
	}

}
