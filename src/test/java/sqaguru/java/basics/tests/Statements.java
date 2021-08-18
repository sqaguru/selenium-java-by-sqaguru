package sqaguru.java.basics.tests;

public class Statements {
	public static void main(String[] args) {
		System.out.println("Hello world");

		int number = 21;

		String evenOrOdd = number % 2 == 1 ? "Odd" : "Even";

		System.out.println("evenOrOdd: " + evenOrOdd);

		if (number == 0)
			System.out.println("number is neither even nor odd");
		else if (number % 2 == 1)
			System.out.println("Odd Number");
		else
			System.out.println("Even Number");

		int dayNumber = 5;

		switch (dayNumber) {

		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Not a valid day number");

		}
	}
}
