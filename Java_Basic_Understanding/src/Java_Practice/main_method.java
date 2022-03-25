package Java_Practice;

public class main_method {
	
	// method 1
	public static void main(String [] args) {
		addition();
		
		System.out.println("I am from main method");
	}
	
	
	
	// method 1  out side of the main method
	public static void addition() {
		System.out.println("I am from out side main method but i am inside the addition method");
	}

}

// explain main method-
	// why main method static in java
	// what is the use of main method in java
	// what if we removed main method from the class in java
	// can we use multiple main methods in same class in java


// notes for main methods
	// public - accessible for same class and other classes too
	// private - nobody can use this except main method
	// protected - can be use in same class but not out of the class

// braces info
// () - parenthesis
// [] - square bracket
// {} - flower / curly bracket
