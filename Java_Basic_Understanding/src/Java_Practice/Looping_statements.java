package Java_Practice;

public class Looping_statements {

	public static void main(String[] args) {
		// un-professional way to print number
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		System.out.println("1000");
		
		// looping statements
		/* When we have execute same kind code/conditions/stps/block of code and that code 
		  we just need to write at only one time (not repetitively) that is nothing but the 
		 looping statements. We use looping to execute same kind of code whenever we required. */
		
		// Type of loops
		// 1. For loop
		// 2. While loop
 		// 3. Advance For loop ( we will see this after array understanding)
		
		System.out.println("----------------------");
		
		// Professional way to print number
		int n;
		for (n = 1; n <= 100; n++) {
			System.out.println(n);
		}
		
	}

}
