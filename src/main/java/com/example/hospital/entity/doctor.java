package com.example.hospital.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class doctor {
	@Id
	
	private int id;
	private String phoneno;
	
	private String first_name;
	private String last_name;
	private String usser_name;
	private String passwo;
	private String role;
	private String spacilization;
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}		
	@Override
	public String toString() {
		return "doctor [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", usser_name="
				+ usser_name + ", password=" + passwo + ", spacilization=" + spacilization + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsser_name() {
		return usser_name;
	}
	public void setUsser_name(String usser_name) {
		this.usser_name = usser_name;
	}
	public String getPassword() {
		return passwo;
	}
	public void setPassword(String password) {
		this.passwo = password;
	}
	public String getSpacilization() {
		return spacilization;
	}
	public void setSpacilization(String spacilization) {
		this.spacilization = spacilization;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
