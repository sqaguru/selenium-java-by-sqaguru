package orangehrmtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SignUpTest {
	@Test
	public void signUpTest() { 

		System.setProperty("webdriver.chrome.driver",
				"D:\\\\sqa-guru\\\\selenium-java-by-sqaguru\\\\resources\\\\drivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.orangehrm.com/contact-sales/");

		driver.findElement(By.xpath("//* [@id=\"header-navbar\"]/ul[3]/li[1]/a")).click();

		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("SQA");

		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("GURU");

		Select selectEmployee = new Select(driver.findElement(By.id("Form_submitForm_NoOfEmployees")));

		selectEmployee.selectByVisibleText("101 - 150");

		Select selectCountry = new Select(driver.findElement(By.id("Form_submitForm_Country")));

		selectCountry.selectByVisibleText("India");

		driver.findElement(By.id("Form_submitForm_action_request")).submit();

	}
}
