package sqaguru.java.basics.tests;

public class ExceptionsTest {
	public static void main(String[] args) throws NotMatchNumberException {
		int number = 30;
		if (number != 20) {
			throw new NotMatchNumberException("Number did not match");
		}
		System.out.println("hello after exception");
	}
}
