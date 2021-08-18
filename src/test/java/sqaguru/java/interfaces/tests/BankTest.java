package sqaguru.java.interfaces.tests;

public class BankTest {

	static RBI myBankObj;

	public static void main(String[] args) {
		MyBank myBank = new MyBank();

		myBank.provideCreditCard();

		myBank.createSavingAccount();

		ANZBank anz = new ANZBank();

		myBankObj = new MyBank();// Polymorhipism

		((MyBank) myBankObj).provideCreditCard();//type casting need to be done for using child class member when reference is of parent class

		myBankObj.createSavingAccount();

		myBankObj = new ANZBank();

		myBankObj.createSavingAccount();

	}
}
