package co.in.selenium.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaitForPageLoadTest {
	@Test
	public void dragAndDropTest() throws InterruptedException {
		System.out.println("Hello from dragAndDropTest");
		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/droppable/");
		int waitCounter = 0;
		while (true) {
			System.out.println("readyState: "
					+ ((JavascriptExecutor) driver).executeScript("return document.readyState").toString());
			if (waitCounter > 10) {
				System.out.println("waited for 10 seconds, page did not load");
				break;
			}
			if (((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
					.equalsIgnoreCase("complete")) {
				break;
			} else {
				Thread.sleep(100);
			}
			waitCounter++;
		}

		Thread.sleep(5000);

	}
}
