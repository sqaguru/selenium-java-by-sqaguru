package sqaguru.selenium.switchcommand.tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");

	
		driver = new ChromeDriver();// launching the chrome browser

		driver.get("http://facebook.com/");

		String mainWindowId = driver.getWindowHandle();

		System.out.println("mainWindowId: " + mainWindowId);

		driver.findElement(By.xpath("//a[@title='Learn more about Facebook Pay']")).click();

		Thread.sleep(5000);

		Set<String> windowIds = driver.getWindowHandles();

		for (String id : windowIds) {
			System.out.println("id: " + id);
			if (!mainWindowId.equals(id)) {
				driver.switchTo().window(id);
			}
		}

		System.out.println("new window title is: " + driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.close();//close will close the current window only
		
		//driver.quit();//will close all the windows opened by selenium/driver
		
		driver.switchTo().window(mainWindowId);


	}

}
