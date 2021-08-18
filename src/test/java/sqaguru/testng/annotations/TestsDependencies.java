package sqaguru.testng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsDependencies/* extends Base */ {

	@Test(groups = { "SMOKE_TEST" }) // TestNG annotations
	public void loginToIRCTCAppTest() {

		System.out.println("login to IRCTC App");

	}

	@Test(dependsOnMethods = { "loginToIRCTCAppTest" }, priority = 2) // TestNG annotations
	public void searchForTrainTest() {

		System.out.println("search for trains");
		Assert.assertTrue(false, "Intentional failure");

	}

	@Test(dependsOnMethods = { "searchForTrainTest" }) // TestNG annotations
	public void createTicketTest() {

		System.out.println("create ticket test");

	}

	@Test(dependsOnMethods = "createTicketTest") // TestNG annotations
	public void makePaymentTest() {

		System.out.println("make payment test");

	}

	@Test(dependsOnMethods = "loginToIRCTCAppTest", priority = 3) // TestNG annotations
	public void bookingHotelTest() {

		System.out.println("Hotel booking test");

	}

	@Test(dependsOnMethods = { "bookingHotelTest", "makePaymentTest" }, alwaysRun = true) // TestNG annotations
	public void returnBackTest() {

		System.out.println("return origin test");

	}

}
