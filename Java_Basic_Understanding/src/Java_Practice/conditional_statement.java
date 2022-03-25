package Java_Practice;

public class conditional_statement {

	public static void main(String[] args) {
		
		// What is conditional statement
		/* 	when we have validate/execute some particular block of code
		 	on the base of some situation or assumption or conditions 
		 	that part is nothing but the use of conditional statement */
		
		// We have if statement, if else statement and else if statements
		// Syntax:
	/*	if(Conditions) {
			Executional block
		}
		else if(condition) {
			Executional block
		}
		else {
			default excuational block
		}
	*/
		// single if statement example
	// Write a script to show which no is greater from the two numbers
		
		int number1 = 21;
		int number2 = 52;
		
		if(number1 < number2) {
			System.out.println("Number 2 is greater that Number 1");
		}
		
		// if statement with else block example
		
		if(number1 < number2) {
			System.out.println("Number 2 is greater that Number 1");
		}
		else {
			System.out.println("Both Numbers are same or somethins is not correct");
		}
		
		// multiple if statement example
		
		if(number1 < number2) {
			System.out.println("Number 2 is greater that Number 1");
		}
		else if(number1 > number2) {
			System.out.println("Number 1 is greater than Number 2");
		}
		else if(number1 == number2) {
			System.out.println("Both Numbers are same");
		}
		else {
			System.out.println("Something is worng");
		}
		
		// Nested if conditions (condition inside the condition)
		
		if(number1 < number2) { // condition 1
			System.out.println("Number 2 is greater that Number 1");
			
			if(number2 < 50) { // condition 2
				System.out.println("Number 2 is less than 50");
			}
		}
	}

}
