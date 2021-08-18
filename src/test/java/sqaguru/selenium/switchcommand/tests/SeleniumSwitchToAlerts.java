package sqaguru.selenium.switchcommand.tests;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSwitchToAlerts {

	public static void main(String[] args) {

		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");

			driver.findElement(By.xpath("//input[@value='Click for Popup']")).click();

			Alert myAlert = driver.switchTo().alert();

			String alertText = myAlert.getText();

			System.out.println("alertText: " + alertText);

			myAlert.accept();

			System.out.println("alert accepted");
			
			try {
				Alert alert2 = driver.switchTo().alert();
				alert2.accept();
				} catch (Exception e) {
					System.out.println("Alert not found");
				}finally {
					
					System.out.println("finally excuting rest of the code");
				}
			System.out.println("proceding remains steps");
			
			
		}
	}
}
