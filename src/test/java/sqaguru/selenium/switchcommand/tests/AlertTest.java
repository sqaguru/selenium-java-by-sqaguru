package sqaguru.selenium.switchcommand.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AlertTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();// launching the chrome browser

		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");// navigate to taret
																									// url

		driver.findElement(By.xpath("//input[@value='Click for Popup']")).click();

		Thread.sleep(5000);
		try {

			Alert alert = driver.switchTo().alert();

			alert.accept();

			System.out.println("Alert accepted");

		} catch (NoAlertPresentException noAlertPresentException) {
			System.out.println("No Alert found exception " + noAlertPresentException.getMessage());
		}

		System.out.println("Alert handled");

		Thread.sleep(3000);

		try {
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException noAlertPresentException) {
			System.out.println("Alert not found for second time: " + noAlertPresentException.getMessage());
			// noAlertPresentException.printStackTrace();
		}

	}

}
