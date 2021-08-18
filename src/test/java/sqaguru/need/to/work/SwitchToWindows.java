package sqaguru.need.to.work;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindows {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.out.println("hello world from FirstTest");

		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("Facebook Pay")).click();

		String currentWindowId = driver.getWindowHandle();

		System.out.println("currentWindowId: " + currentWindowId);

		Set<String> windowIds = driver.getWindowHandles();

		for (String windowId : windowIds) {

			System.out.println("windowId: " + windowId);

			// if (!currentWindowId.equals(windowId)) {

			String windowTitle = driver.getTitle();

			System.out.println("window title before switch: " + windowTitle);

			driver.switchTo().window(windowId);

			windowTitle = driver.getTitle();

			if (driver.findElements(By.linkText("Ways to Pay")).size() > 0) {
				break;
			}

			// }

		}

		driver.findElement(By.linkText("Ways to Pay")).click();

		driver.close();// close page - close the current window

		driver.switchTo().window(currentWindowId);
		
		String titleCloseWindow = driver.getTitle();

		System.out.println("titleCloseWindow: " + titleCloseWindow);

		driver.quit();// close all browser windows

	}

}
