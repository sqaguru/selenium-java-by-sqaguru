package co.in.selenium.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class TitleTest {
	@Test
	public void dragAndDropTest() throws InterruptedException, FindFailed {
		System.out.println("Sample test");
		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com/");

		driver.manage().window().maximize();
		
		String title = driver.getTitle();

		System.out.println("title: " + title);
	}
}
