package sqaguru.selenium.switchcommand.tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTestUsingToolsQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://demoqa.com/browser-windows");

			System.out.println("first window title: " + driver.getTitle());

			String currentWindowId = driver.getWindowHandle();

			driver.findElement(By.xpath("//button[@id='windowButton']")).click();

			Set<String> windowIds = driver.getWindowHandles();

			for (String id : windowIds) {
				if (id != currentWindowId) {
					driver.switchTo().window(id);
					break;
				}
			}

			String message = driver.findElement(By.id("sampleHeading")).getText();

			System.out.println(message);

		}
	}
}
