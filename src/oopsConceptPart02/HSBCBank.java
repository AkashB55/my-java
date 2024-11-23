package oopsConceptPart02;

public class HSBCBank implements USBank, BrazilBank {

	public void credit() {
		System.out.println("hsbc--credit");
	}

	public void debit() {
		System.out.println("hsbc--debit");
	}

	public void transferMoney() {
		System.out.println("hsbc--transfer money");
	}

	public void educationLoan() {
		System.out.println("hsbc--edu loan");
	}

	public void carLoan() {
		System.out.println("hsbc--car loan");
	}
	
	public void mutualFunds() {
		System.out.println("hsbc--mutual funds");
	}

}