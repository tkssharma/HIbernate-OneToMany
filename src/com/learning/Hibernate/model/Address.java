package com.learning.Hibernate.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity
public class Address {


	public int getId() {
		return add_id;
	}
	public void setId(int id) {
		this.add_id = id;
	}
	
	@Id
	@GeneratedValue
	public int  add_id ;
	public String  city ;
	public String  state ;
	public String  country ;

	@ManyToOne
	@JoinColumn(name="id" )
	public Employee employee1;

	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee getEmployee1() {
		return employee1;
	}
	public void setEmployee1(Employee employee1) {
		this.employee1 = employee1;
	}
	



}
