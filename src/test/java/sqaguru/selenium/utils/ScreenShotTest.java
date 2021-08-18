package sqaguru.selenium.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import sqaguru.framework.base.Base;

public class ScreenShotTest{

	@Test
	public void captureScreenShotTest() throws IOException {
		WebDriver driver=new ChromeDriver();
		// synchronization or waits - Add an explicit wait for an alert to be present
		// Add an explicit wait for two windows to open
		// element tobe clickable
		try {
			driver.get("https://www.facebook.com/");// navigate to taret url

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// this wait is applicable for all the steps
																			// in the execution
			// captureScreenShot(driver);

			WebElement googleSearchText = driver.findElement(By.name("q"));

			// captureScreenShot(driver);

			googleSearchText.clear();

			// action or operation
			googleSearchText.sendKeys("Selenium Dev");

			driver.findElement(By.name("q")).submit();

			WebDriverWait wait = new WebDriverWait(driver, 40);

			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[text()='Selenium (software) - Wikipedia']"))).click();

			String searchResultTitle = driver.getTitle();

			System.out.println("searchResultTitle: " + searchResultTitle);

		} catch (NoSuchElementException nSEE) {
			captureScreenShot(driver);
		}


	}

	public static void captureScreenShot(WebDriver driver) throws IOException {

		File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date date = new Date();

		String fileName = date.toString().replace(":", "_").replace("-", "_").replace(" ", "_");

		File destFile = new File(
				"D:\\sqa-guru\\workspace_bat202012147PM\\selenium-automation-by-sqaguru\\resources\\screen-shots\\screenshot_"
						+ fileName + ".png");

		FileUtils.copyFile(screenShotFile, destFile);

	}

}
