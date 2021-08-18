package sqaguru.framework.base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Base {
	protected WebDriver driver;
	public static final String DRIVER_PATH = "D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver.exe";

	@DataProvider(name = "googleSearchData")
	public String[][] createData1() {
		return new String[][] { { "Selenium", "Google", "Hyd" }, { "TestNG", "Google", "Pune" },
				{ "Java", "Google", "Mumbai" } };
	}

	@DataProvider(name = "googleSearchDataMap")
	public Object[] dpMaps() {
		Map<String, String> googleSearchData = new HashMap<String, String>();
		Map<String, String> googleSearchData2 = new HashMap<String, String>();
		Map<String, String> googleSearchData3 = new HashMap<String, String>();

		googleSearchData.put("searchKey", "Selenium Dev");
		googleSearchData2.put("searchKey", "Java Test");
		googleSearchData3.put("searchKey", "TestNG Test");

		Object[] object = new Object[3];
		object[0] = googleSearchData;
		object[1] = googleSearchData2;
		object[2] = googleSearchData3;

		return object;

	}

	@BeforeGroups({ "SMOKE_TEST", "TEST_FEATURE1" })
	public void beforeGroups() {
		System.out.println("before class function()");
		System.setProperty("webdriver.chrome.driver", DRIVER_PATH);

		driver = new ChromeDriver();// launching the chrome browser
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite (from testng_xxx.xml)");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test (from testng_xxx.xml)");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class function()");
		System.setProperty("webdriver.chrome.driver", DRIVER_PATH);

		driver = new ChromeDriver();// launching the chrome browser

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method function()");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method function()");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class function()");
		driver.quit();

	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test (from testng_xxx.xml)");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite (from testng_xxx.xml)");
	}

	@AfterGroups({ "SMOKE_TEST", "TEST_FEATURE1" })
	public void afterGroups() {
		driver.quit();
	}

}
