package Basic_Java;

import java.util.Scanner;

public class conditional_statements {

	public static void main(String[] args) {
	
		/*
		 *  Conditional Statement in java
		 *  1. if statement
		 *  2. if else statement
		 *  3. if else if statement
		 */

		
		
		// ex1. check whether the voter is elgibile for voting or not, age should 18 or more than 18
		
		// if statement
		int voterAge = 20;
		
		if(voterAge >= 18) {
			System.out.println("Voter is elgibile for voting");
		}
		System.out.println("-------------------------------");
		
		// if else statment
		if(voterAge >= 18) {
			System.out.println("Voter is elgibile for voting");
		}
		else {
			System.out.println("Voter is Not elgibile for voting");
		}
		
		System.out.println("-------------------------------");
		
		// if else if statement
		// Ex. Find out the digits in given number
		// logic mechanism - 
//		if number = 1 - 9 = one digit
//		if number = 10-99 = two digit
//		if number = 100 - 999 = three digit
//		if number = 1000 - 9999 = four digit
//		if number = 10000 - 99999 = five digit
//		
//		AND = &&
//		OR = ||
		
		// This code is to take the inputs while running the code
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");		
		 int userNumber = sc.nextInt();  // Read user input
		 System.out.println("Number is: " + userNumber);  // Output user input
				
		int number = userNumber;
	//	int number = 566;
			if(number > 0 && number < 10) {
				System.out.println("Number is One digit");
			}
			else if(number > 9 && number < 100) {
				System.out.println("Number is Two digit");
			}
			else if(number > 99 && number < 1000) {
				System.out.println("Number is Three digit");
			}
			else if(number > 999 && number < 10000) {
				System.out.println("Number is Four digit");
			}
			else if(number > 9999 && number < 100000) {
				System.out.println("Number is Five digit");
			}
			else {
				System.out.println("Number is more than Five digit or negative number");
			}
		
	
			
			
			
			
		
		
		
		
		
		
		
		
		

	}
}
