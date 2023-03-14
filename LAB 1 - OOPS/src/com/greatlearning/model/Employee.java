package com.greatlearning.model;

public class Employee {
	
	private String FirstName, LastName, email, passw;
	
	public Employee() {}
	public Employee(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	
	//Generating Getters and Setters
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	
}
