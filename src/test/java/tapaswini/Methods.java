package tapaswini;

public class Methods {

	public static void main(String[] args) {
		String studentId = "TT007";
		String name = "Ganesh";
		int english = 78;
		int math = 89;
		int science = 76;
		int english1 = 60;
		int math1 = 59;
		int science1 = 66;

		String studentId1 = "TT006";
		String name1 = "Tapaswini";

		int total = 0;

		printDetails(studentId, name);
		totalCal(english, math, science);
		printDetails(studentId1, name1);
		totalCal(english1, math1, science1);

	}

	public static void totalCal(int a, int b, int c) {
		int total = a + b + c;
		System.out.println("total amount - " + total);
	}

	public static void printDetails(String d, String e) {

		System.out.println("Student name - " + d);
		System.out.println("Student studentId - " + e);

	}
}
