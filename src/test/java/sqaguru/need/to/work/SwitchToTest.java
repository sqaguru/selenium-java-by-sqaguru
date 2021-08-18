package sqaguru.need.to.work;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SwitchToTest {

	@Test
	public static void switchToTest() throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.out.println("hello world from FirstTest");

		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\drivers\\chromedriver.exe");

		WebDriver browser = new ChromeDriver();
		
		EventFiringWebDriver driver=new EventFiringWebDriver(browser);
		
		SeleniumListener listener=new SeleniumListener();
		
		driver.register(listener);

		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");

		driver.manage().window().maximize();

		// case(1)

		WebElement popup=driver.findElement(By.xpath("//input[@value='Click for Popup']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", popup);
		
		driver.findElement(By.xpath("//input[@value='Click for Popup']")).click();
		Alert myAlert;
		// try {

		myAlert = driver.switchTo().alert();

		String myAlertText = myAlert.getText();

		Reporter.log("myAlertText: " + myAlertText,true);

		Thread.sleep(2000);

		myAlert.accept();//yes - accept 
		myAlert.dismiss();//no - escape/ cancel / rejection alert case

		driver.findElement(By.xpath("//input[@name='age11']")).sendKeys("25");

		/*
		 * } catch (NoAlertPresentException noAlertPresentException) {
		 * System.out.println(noAlertPresentException.getMessage()); //
		 * noAlertPresentException.printStackTrace();
		 * System.out.println("Alert not found"); } catch (NoSuchElementException
		 * noSuchElementException) {
		 * System.out.println(noSuchElementException.getMessage());
		 * noSuchElementException.printStackTrace();
		 * System.out.println("element not found"); } finally { // in exception or no
		 * exception - finally block gets executed always
		 * System.out.println("I am in finally block{}"); // object.close=null myAlert =
		 * null; }
		 */

		Thread.sleep(2000);
		
		driver.unregister(listener);

	}

}
