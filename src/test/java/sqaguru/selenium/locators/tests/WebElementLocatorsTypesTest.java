package sqaguru.selenium.locators.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocatorsTypesTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		navigateToURL();

		//driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.partialLinkText("New Account")).click();

		System.out.println("Clicked on create facebook account button");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLinks) {
			System.out.println(link.getText());
		}
		
		System.out.println("totalNumberOfLinks: "+allLinks.size());

		Thread.sleep(5000);
		
		driver.findElement(By.id("u_1_b")).isDisplayed();

		System.out.println("Sign-Up button displayed");
		
		int totalDropdownElements = driver.findElements(By.tagName("select")).size();
		
		System.out.println("Total dropdowns on page: "+totalDropdownElements);
		
		String buttonFemale = driver.findElement(By.cssSelector("label[for='u_1_4'][class='_58mt']")).getText();
		
		System.out.println("buttonFemale text: "+buttonFemale);

	}

	public static void navigateToURL() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\workspace_bat202012147PM\\selenium-automation-by-sqaguru\\resources\\webdriver\\chromedriver.exe");

		driver = new ChromeDriver();// launching the chrome browser

		driver.get("https://www.facebook.com/");// navigate to taret url

	}

}
