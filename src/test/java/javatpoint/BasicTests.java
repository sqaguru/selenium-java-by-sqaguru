package javatpoint;

import org.testng.annotations.Test;

public class BasicTests {

	// https://www.javatpoint.com/java-programs
	@Test
	public void armstrongNumber() {
		/*
		 * Armstrong Number in Java: A positive number is called armstrong number if it
		 * is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371,
		 * 407 etc.
		 */

	}

	@Test
	public void factorialNumberTest() {
		int number = 4;
		int factorial = 1;
		while (number > 0) {
			factorial = factorial * number;
			number--;
		}
		System.out.println(factorial);
	}

	/* number matches by its reversal */
	@Test
	public void palindromeNumber() {
		for (int i = 1; i < 1000; i++) {
			int reminder = 0;
			int number = i;
			int sum = 0;
			while (number > 0) {
				reminder = number % 10;
				sum = (sum * 10) + reminder;
				number = number / 10;
			}
			if (i == sum) {
				System.out.println(i);
			}
		}
	}

	@Test
	public void SqrtRootOfNumber() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + ": " + Math.sqrt(i));
		}
	}

	@Test
	public void FibonacciSeriesTest() {
		System.out.println(0);
		System.out.println(1);
		int n1 = 0, n2 = 1;
		int n3;
		for (int i = 2; i < 10; i++) {
			n3 = n1 + n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

	@Test
	public void PrimeNumberTest() {
		for (int n = 1; n < 100; n++) {
			if (isPrime(n)) {
				System.out.println(n);
			}

		}

	}

	private boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
