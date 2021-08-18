package sqaguru.java.basics.tests;

public class MethodsTest {
	public static void main(String[] args) {// calling
		int number1 = 6;
		int number2 = 30;

		addNumbers(number1, number2);

		int total = addNumbers(5, 3);

		System.out.println("total of 5 and 3 is : " + total);

		total = addNumbers(30, 49);
		System.out.println("total of 30 and 49 is : " + total);

		total = addNumbers(21, 31);

		System.out.println("total of 21 and 31 is : " + total);

		total = addNumbers(21, 32, 41);

		System.out.println("total of 21, 32, 41 : " + total);

		int[] subjectMarks = { 20, 30, 40, 50 };

		total = addNumbers(subjectMarks);

		System.out.println("total of 4 array data: " + total);

		int[] subjectMarks2 = { 1, 1, 1, 1, 1 };

		total = addNumbers(subjectMarks2);

		System.out.println("total of 5 array data: " + total);

		String studentName = "Rahul";

		int length = studentName.length();

		System.out.println("length: " + length);

		printCharactersOfAString(studentName);

		String mySentence = "Today is wendesday";
		
		String[] splittedString = mySentence.split(" ");

	}

	private static void printCharactersOfAString(String studentName) {
		for (int index = 0; index < studentName.length(); index++) {
			char myChar = studentName.charAt(index);

			System.out.println("myChar: " + myChar);
		}

	}

	private static int addNumbers(int[] subjectMarks) {
		int total = 0;
		for (int index = 0; index < subjectMarks.length; index++) {
			total = total + subjectMarks[index];
		}
		return total;
	}

	/*
	 * methods definitions - a method is a block of statements which does a complete
	 * task and returns some value
	 */
	// called methods - methods are used to make optimum usage of code/reusable code
	private static int addNumbers(int number1, int number2) {
		int totalOfNumbers = number1 + number2;
		// System.out.println("total Of Numbers: " + totalOfNumbers);
		return totalOfNumbers;
	}

	private static int addNumbers(int number1, int number2, int number3) {
		int totalOfNumbers = number1 + number2 + number3;
		// System.out.println("total Of Numbers: " + totalOfNumbers);
		return totalOfNumbers;
	}

	private static int addNumbers(int number1, int number2, int number3, int number4) {
		int totalOfNumbers = number1 + number2 + number3;
		// System.out.println("total Of Numbers: " + totalOfNumbers);
		return totalOfNumbers;
	}

}
