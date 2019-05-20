package com.springmvc.bean;
//Javabean
public class Employee {
	private int id;
	private String lastName;
	private int gender;  //性别： 1表示male, 0表示female
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(int id, String lastName, int gender, String email) {
		this.id = id;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
	}
	public Employee(String lastName, int gender, String email) {
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
	}
	public Employee(){

	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", gender=" + gender + ", email=" + email + "]";
	}

}
