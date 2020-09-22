
/**
 *Author: Stephen Mullori
 *Date: Sep 22, 2020
 *Discription: creating an new student email
*/

import java.util.Scanner;

public class NewEmailJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name");// creates first name and inital
		String firstName = input.nextLine();
		firstName = firstName.toLowerCase();
		
		String firstInital = firstName.toUpperCase().substring(0,1);
		
		
		System.out.println("What is your second name");// creates middle name and inital
		String middleName = input.nextLine();
		middleName = middleName.toLowerCase();
		
		String middleInital = middleName.toUpperCase().substring(0,1);
		
		System.out.println("What is your last name");// creates last name
		String lastName = input.nextLine();
		lastName = lastName.toLowerCase();
		
		
		System.out.println("What is your date of birth dd-mm-yyyy");//creates date of birth and password
		String dob = input.nextLine();
		
		String password = dob.substring(0,2) + dob.substring(3,5) + dob.substring(6,10);
		
		System.out.println();
		System.out.println(lastName + firstInital + middleInital + "@sharkmail.com");
		System.out.println("temp password: " + password);
		System.out.println("*** This temporary password is very insecure. Please change it immediately! ***");
	}

}
