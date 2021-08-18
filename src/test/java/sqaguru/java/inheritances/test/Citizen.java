package sqaguru.java.inheritances.test;

public class Citizen {

	public Citizen() {
		System.out.println("Citizen Constructor");
	}

	public Citizen(String myMessage) {
		System.out.println(myMessage);
	}

	public final void printMyMessage() {
		System.out.println("Hello from Citizen class");
	}

	public void printCitizenInfo() {
		System.out.println("Hello from print Citizen Info");
	}

	public static void printStaticInfo() {
		System.out.println("Static info citizen");
	}
}
