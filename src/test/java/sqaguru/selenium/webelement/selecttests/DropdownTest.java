package sqaguru.selenium.webelement.selecttests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {

		//System.out.println("hello world from FirstTest");

		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();

		String elementBeforeLogin = driver.findElement(By.xpath("//li[.='Log In']/preceding-sibling::li")).getText();

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		Thread.sleep(3000);

		WebElement elementDay = driver.findElement(By.id("day"));

		Select day = new Select(elementDay);

		day.selectByIndex(1);

		Select month = new Select(driver.findElement(By.id("month")));

		month.selectByVisibleText("Jul");

		List<WebElement> options = month.getOptions();

		for (WebElement option : options) {
			//System.out.println("value(attribute): " + option.getAttribute("value") + " text is: " + option.getText());
		}

		List<WebElement> selectedOptions = month.getAllSelectedOptions();

		for (WebElement selectedOption : selectedOptions) {
			//System.out.println("selected option: value(attribute): " + selectedOption.getAttribute("value")
					//+ " text is: " + selectedOption.getText());
		}

		WebElement selectedOption = month.getFirstSelectedOption();

		//System.out.println("selected option: value(attribute): " + selectedOption.getAttribute("value") + " text is: "
				//+ selectedOption.getText());

		// WebElement monthElement=driver.findElement(By.id("month"));

		// List<WebElement> monthOptions =
		// monthElement.findElements(By.tagName("option"));
		

	}

}
