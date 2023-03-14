package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredGenerationImpl implements CredGeneration{

	@Override
	public String generateEmailId(String firstName, String lastName, String dept){
	
		return firstName + lastName + "@" + dept + ".arsenalfc.com";
	}

	@Override
	public String genPas() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWZYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String spclchars = "!@#$%^&*()_-+*/<>?.~`";
		
		String allchars = caps + small + nums + spclchars;
		String mypassw = "";
		
		Random random = new Random();
		
		for(int i = 0; i < 8; i++) {
			mypassw += String.valueOf(allchars.charAt(random.nextInt(allchars.length())));
		}
		return mypassw;
	}

	@Override
	public void showDetails(Employee e1) {
		
		System.out.println("These are your account details : ");
		System.out.println("Your First Name is "+e1.getFirstName());
		System.out.println("Your Last Name is "+e1.getLastName());
		System.out.println("Your Email ID is "+e1.getEmail());
		System.out.println("Your account password is "+e1.getPassw());
		
	}


	@Override
	public String generateEmailId(Employee empl1, String dept){//Overloaded method
		
		String myEmail = empl1.getFirstName().toLowerCase() + empl1.getLastName().toLowerCase() + "@"+ dept + ".arsenalfc.com";
		return myEmail;
	}
}
