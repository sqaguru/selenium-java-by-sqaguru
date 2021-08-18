package sqaguru.testng.dataproviders.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderTest {
	@Test(dataProvider = "Data")
	public void dataProviderTest(Object data[]) {
		System.out.println("data "+data[0]);
	}

	@DataProvider(name = "Data")
	public Object[][] getData() {
		return new Object[][] {{"d1"},{"d2"}};
	}
}
