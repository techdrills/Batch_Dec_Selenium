package methods;

public class whatIsMethods {

	public static void main(String[] args) {
		
		int a =5;
		
		
		
		addition();
		substraction(10,5);
		
	}

	// what is method/function?
		// method is block of statement or a part of code which performs various tasks at multiple time
		// method has two type
		// 1. method without parameter
		// 2. method with parameter
	
	// create method without parameter
	public static void addition() {
		int a = 4; 
		int b = 6;
		System.out.println(a+b);
	}
	
	// 2. method with parameter
	public static void substraction(int a, int b) {
		System.out.println(a-b);
		
	}
		
}







