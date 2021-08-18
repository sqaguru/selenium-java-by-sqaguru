package sqaguru.need.to.work;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDependencies {
	@Test
	public void morningTest() {
		Reporter.log("morningTest");

	}

	@Test(dependsOnMethods = "morningTest")
	public void WakeUpTest() {
		Reporter.log("WakeUpTest");
		Assert.assertTrue(false);

	}

	@Test(dependsOnMethods = "WakeUpTest"/* hard dependency */)
	public void noonTest() {
		Reporter.log("noonTest");

	}

	@Test(dependsOnMethods = "noonTest", alwaysRun = true, priority=2/* soft dependency */)
	public void eveTest() {
		Reporter.log("eveTest");

	}

	@Test(dependsOnMethods = "noonTest", alwaysRun = true,priority=1 /* soft dependency */)
	public void eveSnacksTest() {
		Reporter.log("eveSnacksTest");

	}
	
	@Test
	public void nightTest() {
		Reporter.log("nightTest");

	}
}
