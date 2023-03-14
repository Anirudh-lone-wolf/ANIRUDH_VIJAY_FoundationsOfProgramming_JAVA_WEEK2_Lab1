package com.greatlearning.app;

import java.util.*;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredGenerationImpl;

public class EmailDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee empl1 = new Employee(); 
		CredGenerationImpl credgen = new CredGenerationImpl();
		
		System.out.print("Enter your First Name : ");
		String firstName = sc.next();
		empl1.setFirstName(firstName);
		System.out.println();
		
		System.out.print("Enter Your Last Name : ");
		String lastName = sc.next();
		empl1.setLastName(lastName);
		System.out.println();
		
		System.out.println("Here are our services. Please enter you choice : \n"+
		                             "1. Technical\n"+
				                     "2. Admin\n"+
		                             "3. HR\n"+
				                     "4. Legal");
		
		int choice = sc.nextInt();
		
		String genemail = "", genpassw = "";
		
		switch(choice) {
		case 1:
			genemail += credgen.generateEmailId(empl1, "tech");
			break;
		case 2:
			genemail += credgen.generateEmailId(empl1, "admin");
			break;
		case 3:
			genemail += credgen.generateEmailId(empl1, "hr");
			break;
		case 4:
			genemail +=credgen.generateEmailId(empl1, "legal");
			break;
		default: 
			System.out.println("Please enter a valid choice.");
			break;
		}
		
		genpassw = credgen.genPas();
		empl1.setEmail(genemail);
		empl1.setPassw(genpassw);
		
		credgen.showDetails(empl1);
		sc.close();
	}

}
