package com.example.hospital.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;


@Entity
public class Patient {
	@Id

private int id;
private String firstname;

private int age;
private String address;
private String phoneno;
private String problem_discription;

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone_no() {
	return phoneno;
}
public void setPhone_no(String phone_no) {
	this.phoneno = phone_no;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getProblem_discription() {
	return problem_discription;
}
public void setProblem_discription(String problem_discription) {
	this.problem_discription = problem_discription;
}
@Override
public String toString() {
	return "Patient [id=" + id + ", name=" + firstname + ", age=" + age + ", address=" + address + ", phone_no=" + phoneno
			+ ", problem_discription=" + problem_discription + "]";
}

}
