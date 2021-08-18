package sqaguru.java.basics.tests;

public class PrimeNumberTest {
	public static void main(String[] args) {
		System.out.println("Hello world");

		for (int number = 2; number < 100; number++) {

			System.out.println("======================  checking for number " + number + " =======================");
			boolean isPrime = true;
			for (int modNumber = 2; modNumber < number; modNumber++) {
				System.out.println("checking by divisible number: " + modNumber);
				if (number % modNumber == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("number is prime: " + number);
			}

		}

		System.out.println("****************************************************************");

		int number = 0;
		while (number <= 100) {

			System.out.println("======================  checking for number " + number + " =======================");
			boolean isPrime = true;
			for (int modNumber = 2; modNumber < number; modNumber++) {
				System.out.println("checking by divisible number: " + modNumber);
				if (number % modNumber == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("number is prime: " + number);
			}
			/*
			 * if (number <= 100) // if(No more next button) break;
			 */
			number++;
		}

		System.out.println("****************************************************************");

		number = 0;
		do {

			System.out.println("======================  checking for number " + number + " =======================");
			boolean isPrime = true;
			for (int modNumber = 2; modNumber < number; modNumber++) {
				System.out.println("checking by divisible number: " + modNumber);
				if (number % modNumber == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("number is prime: " + number);
			}
			number++;
		} while (number <= 100);

	}
}
