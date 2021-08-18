package sqaguru.selenium.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import sqaguru.framework.base.Base;

public class ScrollToElementTestUsingJavascriptExecutor extends Base {

	@Test
	public void captureScreenShotTest() throws IOException, InterruptedException {

		// synchronization or waits - Add an explicit wait for an alert to be present
		// Add an explicit wait for two windows to open
		// element tobe clickable
		driver.get("https://www.facebook.com/");// navigate to taret url

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// this wait is applicable for all the steps
																		// in the execution
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//a[.='Messenger']"));

		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.DOWN).build().perform();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class function()");
		// driver.quit();

	}

}
