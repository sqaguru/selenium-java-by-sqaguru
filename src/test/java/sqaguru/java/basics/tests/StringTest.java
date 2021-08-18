package sqaguru.java.basics.tests;

public class StringTest {
	public static void main(String[] args) {// calling

		String mySentence = "Today is Wendesday";

		// printEachWord(mySentence);

		mySentence = " Its a great  day today";

		// System.out.println("mySentence: " + mySentence);

		mySentence = mySentence.replace("great", "wonderful");

		// System.out.println("mySentence: " + mySentence);

		String mySubString = mySentence.substring(0, 5);

		System.out.println("total chars: " + mySentence.length());

		System.out.println("mySubString: " + mySubString);

		// printEachWord(mySentence);

		String firstName = " John ";
		String lastName = " Candy ";

		String fullName = firstName.concat(lastName).trim();

		// System.out.println("full Name: " + fullName);

	}

	private static void printEachWord(String mySentence) {
		String[] myWords = mySentence.split("great");

		for (String myWord : myWords) {// for each method with each type - String, it can be int or other types too
			System.out.println(myWord.replace(" ", ""));
		}

		/*
		 * for (int index = 0; index < mySentence.length(); index++) {// for each method
		 * with each type - String, it can be // int // or other types too
		 * System.out.println(mySentence.charAt(index)); }
		 */

	}

}
