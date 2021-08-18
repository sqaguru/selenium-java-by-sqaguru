package sqaguru.java.interfaces.tests;

public class MyBank implements RBI, WorldBank {

	public void createSavingAccount() {
		// TODO Auto-generated method stub
		System.out.println("creating savings account in MyBank");
	}

	public int provideHomeLoan() {
		System.out.println("providing home loan");
		return 0;
	}

	public void provideAutoLoan() {
		System.out.println("provide auto loan");

	}

	public void provideCreditCard() {
		System.out.println("provide credit card by MyBank");
	}

}
