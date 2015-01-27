package com.learning.Hibernate.model;

import java.util.Date;





import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Employee {
	
	
	@Id
	@GeneratedValue
	private int id;

	
	
	private String name;
	private String password;
	private String email;
	private Date insertTime;

	@OneToMany(mappedBy="employee1")
	public List<Address> address;

	public int getEmp_id() {
		return id;
	}

	public void setEmp_id(int emp_id) {
		this.id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	


}