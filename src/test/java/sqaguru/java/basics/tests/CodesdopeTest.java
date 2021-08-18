package sqaguru.java.basics.tests;

import java.util.Scanner;

import org.testng.annotations.Test;

public class CodesdopeTest {
	@Test
	public void addTwoNumbersTest() {
		Scanner s = new Scanner(System.in);
		int number1, number2;
		System.out.println("Please enter a number: ");
		number1 = s.nextInt();
		System.out.println("Please enter another number: ");
		number2 = s.nextInt();
		int sumOfTwoNumbers = number1 + number2;
		System.out.println("sum Of Two Numbers is: " + sumOfTwoNumbers);

	}

	@Test
	public void printCircumFerenceOfCircleTest() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		int radius = s.nextInt();
		float circumferenceOfCircle = (float) (2 * 3.14 * radius);
		System.out.println("circumferenceOfCircle: " + circumferenceOfCircle);
	}
	
	
}
