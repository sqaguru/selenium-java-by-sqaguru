package co.in.selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Tests {
	@Test
	public void dragAndDropTest() throws InterruptedException, FindFailed {
		System.out.println("Hello from dragAndDropTest");
		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com/");

		driver.manage().window().maximize();
		
		String src = driver.getPageSource();

		System.out.println("src: \n" + src);

		Thread.sleep(5000);

		Screen screen = new Screen();

		Pattern googleSearch = new Pattern(
				"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\screens\\GoogleSearch.PNG");
		
		Pattern googleSearch2=googleSearch.similar(0.7f);

		//screen.wait(googleSearch, 20);

		screen.type(googleSearch2, "Selenium Sikuli");

		Pattern searchButton = new Pattern(
				"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\screens\\SearchButton.PNG");

		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		screen.click(searchButton);

	}
}
