package Basic_Java;

public class String_Functions {

	public static void main(String[] args) {
		
		String name = "   John Doe   ";
		
		// get the lenght of any string
		int nameLenght = name.length();		
		System.out.println("Length of the String - " + nameLenght);
		
		// to make the string uppercase/lowercase
		
		String uppercaseName = name.toUpperCase();
		System.out.println("This is uppercase function - " + uppercaseName);
		
		String lowercaseName = name.toLowerCase();
		System.out.println("This is lowercase function function - " + lowercaseName);
		
		// to remove the spaces from begining / ending of the string
		String trimmedValue = name.trim();
		System.out.println(trimmedValue);
		System.out.println("Length of the String - " + trimmedValue.length());
		
		// Checks whether a string contains a sequence of characters
		boolean contains = name.contains("Doe");
		System.out.println(contains);
		
		String firstName = "Peter";
		String lastName = "Albert";
		int mark1 = 500;
		int mark2 = 560;
		String mark3 = "430";
		
		// method in java to convert string number into the integer
		int mark3New = Integer.parseInt(mark3);
		
		System.out.println(mark1 + mark2 + mark3New);
		
		int totalMarks = mark1+mark2;
		System.out.println(totalMarks);
		
		// to concat or append to string values
		String fullName = firstName.concat(lastName);
		System.out.println(fullName);		
		System.out.println(firstName + " " + lastName);		
		
		
		// java resource link - 
		// https://www.w3schools.com/java/java_ref_string.asp
		
	}

}
