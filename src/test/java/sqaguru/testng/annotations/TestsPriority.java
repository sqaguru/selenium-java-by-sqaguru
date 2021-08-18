package sqaguru.testng.annotations;

import org.testng.annotations.Test;

public class TestsPriority/* extends Base */ {

	@Test(groups = { "SMOKE_TEST" },priority=1) // TestNG annotations
	public void loginToIRCTCAppTest() {

		System.out.println("login to IRCTC App");

	}

	@Test(priority=2) // TestNG annotations
	public void searchForTrainTest() {

		System.out.println("search for trains");

	}

	@Test(priority=3)  // TestNG annotations
	public void createTicketTest() {

		System.out.println("create ticket test");

	}

	@Test(priority=4)  // TestNG annotations
	public void makePaymentTest() {

		System.out.println("make payment test");

	}

	@Test(priority=5)  // TestNG annotations
	public void bookingHotelTest() {

		System.out.println("Hotel booking test");

	}

	@Test(priority=6)  // TestNG annotations
	public void returnBackTest() {

		System.out.println("return origin test");

	}

}
