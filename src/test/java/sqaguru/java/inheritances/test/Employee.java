package sqaguru.java.inheritances.test;

public class Employee extends Citizen {
	public Employee() {
		super("Hi - to super constructor");
		System.out.println("Employee Constructor");
	}

	public void printInfo() {
		super.printCitizenInfo();
		printCitizenInfo();
		// super.printMyMessage();
		// System.out.println("Hello from print Citizen Info");
	}

	public void printCitizenInfo() {
		System.out.println("printing citizen info from employee class");
	}

	public static void printStaticInfo1() {
		System.out.println("Static info employee");
	}
}
