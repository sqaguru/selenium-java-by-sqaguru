package sqaguru.selenium.firsttest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTest {

	@Test(priority = 1) // attribute - priority, attribute value=1
	public static void firstTest() {

		SoftAssert softAssert = new SoftAssert();

		System.out.println("hello world from FirstTest");

		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\drivers\\chromedriver.exe");

		WebDriver browser = new ChromeDriver();

		EventFiringWebDriver driver = new EventFiringWebDriver(browser);

		driver.get("http://www.google.com");

		String actualTitle = driver.getTitle();

		System.out.println("The actual title is: " + actualTitle);

		// assertions using testng
		Assert.assertEquals(actualTitle, "Google", "Google page title validation");// Hard assertion

		Assert.assertTrue(actualTitle.contains("GooG"), "Title validation");

		softAssert.assertEquals(actualTitle, "Google", "Google page title validation");// Soft assertion

		// manual validation
		if (actualTitle.equals("Google-1")) {
			Reporter.log("Google Title validation: Passed", true);
		} else {
			Reporter.log("Google Title validation: Failed", true);
		}

		// WebElement class used to store element

		takeScreenShot(driver, "FirstTest_1");

		WebElement inputBox = driver.findElement(By.name("q"));

		File inputButtonScreen = inputBox.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(inputButtonScreen, new File(
					"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\screenshots\\inputSearchButton.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/* driver.findElement(By.name("q")).isDisplayed(); */
		driver.findElement(By.cssSelector("input[name='q']")).isDisplayed();

		driver.findElement(By.id("tophf")).isDisplayed();

		driver.findElement(By.name("q")).sendKeys("selenium dev");

		takeScreenShot(driver, "FirstTest_2");

		String howSearchCompleteText = driver.findElement(By.partialLinkText("How Search")).getText();

		System.out.println("The complete link text is : " + howSearchCompleteText);

		if (howSearchCompleteText.equals("How Search works")) {
			System.out.println("How Search works Title validation: Passed");
		} else {
			System.out.println("How Search works Title validation: Failed");
		}

		inputBox.submit();

		Duration maxWaitTimeInSec = Duration.ofSeconds(40);
		Duration pollingTimeInSec = Duration.ofSeconds(5);

		/*
		 * Wait<WebDriver> fluentWait = new
		 * FluentWait<WebDriver>(driver).withTimeout(maxWaitTimeInSec)
		 * .pollingEvery(pollingTimeInSec).ignoring(NoSuchElementException.class);
		 * 
		 * WebElement myLink = fluentWait.until(new Function<WebDriver, WebElement>() {
		 * 
		 * public WebElement apply(WebDriver driver) { // TODO Auto-generated method
		 * stub return driver.findElement(By.partialLinkText("Download")); }
		 * 
		 * });
		 */

		takeScreenShot(driver, "FirstTest_3");

		// WebElement linkDownload = driver.findElement(By.partialLinkText("Download"));

		//myLink.isDisplayed();

		int totalLink = driver.findElements(By.tagName("a")).size();

		System.out.println("total links on my page are : " + totalLink);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			System.out.println("______________________________________________________");
			System.out.println("The link text is: " + link.getText());
			System.out.println("The link href is: " + link.getAttribute("href"));
		}

		softAssert.assertAll();

	}

	@Test(priority = 2)
	public void test2() {

		System.out.println("test2");

		SoftAssert softAssert = new SoftAssert();

		System.out.println("hello world from FirstTest");

		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
	}

	@Test(priority = 3)
	public void myTest() {
		Reporter.log("I am in myTest", true);
	}

	@Test(priority = 4)
	public void wakeUpTest() {
		Reporter.log("I am in wakeUpTest", true);
	}

	@Test(priority = 5)
	public void noonTest() {
		Reporter.log("I am in noonTest", true);
	}

	@Test(priority = 6)
	public void eveTest() {
		Reporter.log("I am in eveTest", true);
	}

	@Test(priority = 7)
	public void nightTest() {
		Reporter.log("I am in nightTest", true);
	}

	private static void takeScreenShot(WebDriver driver, String fileName) {
		// takeScreenShot class
		// WebDriver - Interface => ChromeDriver, FireFoxDriver, InternetExplorer
		// WebElement
		// Select
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destFile = new File(
				"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\screenshots\\" + fileName + ".PNG");

		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			System.out.println("Exception occured while screen capture");
		}

	}

}
