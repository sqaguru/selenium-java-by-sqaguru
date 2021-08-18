package sqaguru.java.basics.tests;

public class VariableAndTypes {

	public static void main(String[] args) {
		System.out.println("Hello world");

		int number = 5;

		int number2;

		number2 = number;

		System.out.println("number2: " + number2);

		number2 += number;

		number2 = number2 + number;

		System.out.println("number2: " + number2);

		int number3;
		
		System.out.println("before increament number "+number);
		
		number3=number++;//post-increamental
		
		System.out.println("number3: " + number3);
		System.out.println("number "+number);
		
		
		number3 = number++ * number2;

		System.out.println("number3: " + number3);

		number3 = ++number * number2;

		System.out.println("number3: " + number3);
		
	}

}
