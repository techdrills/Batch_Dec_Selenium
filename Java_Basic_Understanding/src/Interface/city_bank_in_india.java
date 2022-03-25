package Interface;

public class city_bank_in_india implements indian_bank_interests {

	public static void main(String[] args) {
		
		city_bank_in_india j = new city_bank_in_india();
		j.pensions();
		j.car_loan();
		j.education_loan();
		j.personal_loan();
		
	}

	@Override
	public void education_loan() {
		System.out.println("City bank charges 20 percent interest rates on education loan");
		
	}

	@Override
	public void personal_loan() {
		System.out.println("City bank charges 15 percent interest rates on personal loan");
		
	}

	@Override
	public void car_loan() {
		System.out.println("City bank charges 25 percent interest rates on car loan");
		
	}

	@Override
	public void pensions() {
		System.out.println("City bank charges 10 percent interest rates on pensions");
		
	}
}
