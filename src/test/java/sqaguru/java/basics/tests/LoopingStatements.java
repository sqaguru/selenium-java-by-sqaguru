package sqaguru.java.basics.tests;

public class LoopingStatements {
	public static void main(String[] args) {
		System.out.println("Hello world");

		for (int number = 0; number < 100; number++) {

			if (number == 0)
				System.out.println("number is neither even nor odd");
			else if (number % 2 == 1)
				System.out.println(number + " Odd Number");
			else
				System.out.println(number + " Even Number");
		}

	}
}
