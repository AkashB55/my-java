package abstractionConcept;

public abstract class Bank {

	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;

	public abstract void loan();

	public void credit() {
		System.out.println("Bank--credit");
	}

	public void debit() {
		System.out.println("Bank--debit");
	}
}
