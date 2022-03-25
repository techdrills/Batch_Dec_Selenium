package Inheritence;

// what is inheritence-
// To accessing the Parent class properties into the child class that is nothing but inheritence
// two types of inheritence
// 1. Single level inheritence
// 2. multi level inheritence
// How to use inheritence = with help of extends keyword

class grandfather extends advancefather{
	public void farm() {
		System.out.println("I am Grand Father and I have a FARM");
	}
}

class advancefather{
	public void bonds() {
		System.out.println("I have few bonds of rs 500000");
	}
	
	public void business() {
		System.out.println("I have few businesses  of rs 5000000");
	}
}

class father extends grandfather {
	public void car() {
		System.out.println("I am father and I have 2 Car's");
	}
}


public class child {

	public static void main(String[] args) {
		father f = new father();
		f.car();
		f.farm();
		f.business();
		f.bonds();
	}

}
