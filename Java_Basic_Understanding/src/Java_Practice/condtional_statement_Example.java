package Java_Practice;

public class condtional_statement_Example {

	public static void main(String[] args) {
	// write a script to identify how many digits in the given number
		// 4 - one digit - 1,2,3,4,5,6,7,8,9,10
		// 45 - two digit - 10,11,50,90,95,98,99,100
		// 450 - three digit - 100,500,900,998,999,1000
		// 3245 - four digit - 1000, 9999,10000
		// 23523 - five digit - 100000, 99999,100000
		
		int number = 1798987;
		
		if(number > 0) { // condition to check no is greater than 0
				// if no is greater than 0 then only following lines will execute
			if(number > 0 && number < 10) {
				System.out.println("Number is ONE Digit");
			}
			else if(number > 9 && number < 100) {
				System.out.println("Number is TWO Digit");
			}
			else if(number > 99 && number < 1000) {
				System.out.println("Number is THREE Digit");
			}
			else if(number > 999 && number < 10000) {
				System.out.println("Number is FOUR Digit");
			}
			else if (number > 9999 && number < 100000) {
				System.out.println("Number is FIVE Digit");
			}
			else {
				System.out.println("Given Number greater than 5 Digits");
			}
		
	}
	else {
		System.out.println("Please enter valid positive number");
	}

	}

}
