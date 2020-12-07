package co.in.sqaguru.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class Base {
	protected WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\StellarAlgo_QA\\TestAutomation\\TAStellarAlgo\\src\\test\\resources\\driver\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Reporter.log("Test Excecution Started..", true);
		driver.get("https://app-qa.stellaralgo.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@DataProvider(name = "cohortBuilder")
	public Object[] dpCohortBuilder() {
		String tdFilePath = "C:\\StellarAlgo_QA\\TestAutomation\\TAStellarAlgo\\src\\test\\resources\\testdata\\TD_InsightsCohortBuilderCustomerSearchByGender.xls";
		String sheetName = "TestData";
		return ExcelReader.readExcelData(tdFilePath, sheetName);
	}

	@DataProvider(name = "cohortEvents")
	public Object[] dpCohortEvents() {
		String tdFilePath = "C:\\StellarAlgo_QA\\TestAutomation\\TAStellarAlgo\\src\\test\\resources\\testdata\\TD_InsightsCohortBuilderCustomerSearchByGender.xls";
		String sheetName = "TestData2";
		return ExcelReader.readExcelData(tdFilePath, sheetName);
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
