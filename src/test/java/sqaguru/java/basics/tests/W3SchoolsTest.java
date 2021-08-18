package sqaguru.java.basics.tests;

import org.testng.annotations.Test;

public class W3SchoolsTest {
	@Test
	public void methodOverLoading() {
		printData(5);
	}

	private void printData(double d) {
		System.out.println("double: " + d);
		
	}

	public void printData(int data) {
		System.out.println("int: " + data);
	}
	
	public void printData(float data) {
		System.out.println("float: " + data);
	}
}
