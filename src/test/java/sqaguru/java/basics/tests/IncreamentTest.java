package sqaguru.java.basics.tests;

public class IncreamentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 5;

		int number2 = 0;
		int number3 = 0;

		number2 = number1++;

		System.out.println("number2: " + number2);

		number3 = ++number1;

		System.out.println("number3: " + number3);

		int multiplyNumber = number1++ * 5;

		System.out.println("multiplyNumber: " + multiplyNumber);

		System.out.println("number1: " + number1);

		int number4 = 0;

		number4 *= number1;// operand and operator

		System.out.println("number4: " + number4);

		int number5 = 15;

		number5 %= number1;// mod operator

		System.out.println("number5: " + number5);

		boolean myResult = number5 == number1 || number2!=number3;
		
		System.out.println("myResult: " + myResult);

	}

}
