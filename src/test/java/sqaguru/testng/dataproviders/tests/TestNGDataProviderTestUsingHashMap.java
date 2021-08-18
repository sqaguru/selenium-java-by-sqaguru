package sqaguru.testng.dataproviders.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderTestUsingHashMap {
	@Test(dataProvider = "Data")
	public void dataProviderTest(HashMap data) {
		System.out.println("data " + data.get("name"));
	}

	@DataProvider(name = "Data")
	public Object[] getData() {
		Object[] object = new Object[2];
		Map<String, String> hMap1 = new HashMap<String, String>();
		hMap1.put("name", "Ram");
		Map<String, String> hMap2 = new HashMap<String, String>();
		hMap2.put("name", "Sam");
		object[0]=hMap1;
		object[1]=hMap2;
		return object;
	}
}
