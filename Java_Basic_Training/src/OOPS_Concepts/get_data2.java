package OOPS_Concepts;

public class get_data2 extends get_data1 {

	public static void main(String[] args) {
		
		get_data1.addition(12, 23);
		addition1(10,20);
		
		fatherWallet();
		
		get_data2 gt = new get_data2();
		gt.fatherCar();
	}
	
	static void fatherWallet() {
		System.out.println("This is father money");
	}
	
	void fatherCar() {
		System.out.println("This is father money");
	}
	
	
	

}
