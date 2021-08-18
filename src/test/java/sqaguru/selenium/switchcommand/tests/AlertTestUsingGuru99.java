package sqaguru.selenium.switchcommand.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertTestUsingGuru99 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// launching the chrome browser

		driver.get("http://demo.guru99.com/test/delete_customer.php");
		// url
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("santosh");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);

		String alertMessage = driver.switchTo().alert().getText();

		System.out.println("alertMessage is:" + alertMessage);

		if (alertMessage.equalsIgnoreCase("Do you really want to delete this Custmer?")) {

			driver.switchTo().alert().accept();
		} else {

			driver.switchTo().alert().dismiss();

		}
		Thread.sleep(2000);

		alertMessage = driver.switchTo().alert().getText();
		System.out.println("alertMessage is 2nd Time:" + alertMessage);

		driver.switchTo().alert().accept();

      Alert secondAlert = driver.switchTo().alert();
     
     System.out.println("alertMessage is 2nd Time:" + alertMessage);
     
     
     secondAlert.accept();
     
     Thread.sleep(2000);
     
     driver.quit();

	}

}
