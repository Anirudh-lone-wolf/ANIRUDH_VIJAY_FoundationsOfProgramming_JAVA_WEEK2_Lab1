package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface CredGeneration {
	
	String generateEmailId(String firstName, String lastName, String dept); //to generate email
	String genPas(); //to generate password
	void showDetails(Employee e1); //to display email and password
	String generateEmailId(Employee empl1, String dept);

}
