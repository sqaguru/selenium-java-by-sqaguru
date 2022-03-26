package tapaswini;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (true) {
			String month = null;
			System.out.print("Enter a number : ");
			int n = s.nextInt();

			switch (n) {
			case 0:
				System.out.println("terminate");
				break;
			case 1:
				month = "january";
				break;
			case 2:
				month = "february ";
				break;
			case 3:
				month = "March";
				break;
			case 4:
				month = "April";
				break;

			case 5:
				month = "May";
				break;
			case 6:
				month = "June";
				break;
			case 7:
				month = "July";
				break;
			case 8:
				month = "August";
				break;
			case 9:
				month = "September";
				break;
			case 10:
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month = "December";
				break;

			default:

				System.out.println("Enter number is invalid");

			}
			if (n > 0) {
				System.out.println("Name of the month - " + month);
			}

			if (n == 0) {

				break;
			}

		}

	}

}