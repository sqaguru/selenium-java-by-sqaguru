package sqaguru.testng.annotations;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 1)
	void open() {
		System.out.println("Open");
	}

	@Test(priority = 3)
	void Launch() {
		System.out.println("launch");
	}

	@Test
	void Perform() {
		System.out.println("perform");
	}
}