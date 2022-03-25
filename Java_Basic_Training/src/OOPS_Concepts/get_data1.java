package OOPS_Concepts;

public class get_data1 extends common_class {

	public static void main(String[] args) 
	{	
		System.out.println("this is inside main method");	
		//common_class cc = new common_class();  // object to access methods from common_class
		add();
		addition(10, 40);
		addition(20, 20.20);
		addition1(40, 40);
		addition1(40, 40.50);
				
	}
	
	
	
	public String myfunction() 
	{
		String name = "adbf";
		return name;
	}
	
	// this is method/function without parameter
	static void add() {
		int a =60;
		int b = 40;
		int c = a+b;
	System.out.println("This is add method without parameter and addition is -" + c);
	}
	
	// this is method/function with parameter
	
	static void addition(int a, int b) {
		int c = a+b;
		System.out.println("GET DATA 1 - This is addition method with parameter and addition is -" + c);
	}
	
	// concept of method/function overloading
	static void addition(int a, double b) {
		double c = a+b;
		System.out.println("This isaddition addition method with parameter and addition is -" + c);
	}
//	
	

}




