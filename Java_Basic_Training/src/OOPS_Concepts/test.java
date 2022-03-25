package OOPS_Concepts;

public class test {
	
	public static void main(String[] abc) {
		System.out.println("This is test class");
		
		// An array is a collection of multiple element of same data type
		String[] names = {"Vikas", "Rohit", "Rajat" , "fourth"}; // declaration in array
		int[] numbers = {1,2,3,4,5,6,7};
		
		for(int i=0; i< names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(int i =0; i < numbers.length; i++) {			
			if(numbers[i] % 2 == 0) {
				System.out.println(numbers[i] + " is Even Number");
			}
			else {
				System.out.println(numbers[i] + " is Odd Number");
			}
		}
		
		
	}
}
