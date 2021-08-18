package sqaguru.testng.annotations;

import org.testng.annotations.Test;

public class TestNGTestPriority {
	@Test(priority = 2)
	public void testCase001() {
		System.out.println("testCase001");
	}

	@Test(priority = 1)
	public void testCase002() {
		System.out.println("testCase002");
	}

	@Test()
	public void testCase003() {
		System.out.println("testCase003");
	}
}
