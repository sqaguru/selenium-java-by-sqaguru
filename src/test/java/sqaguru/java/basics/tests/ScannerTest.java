package sqaguru.java.basics.tests;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ScannerTest {
	@Test
	public void printReducingNumbersTillZero() {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		while (number >= 0) {
			System.out.println(number);
			number--;
		}
	}

}
