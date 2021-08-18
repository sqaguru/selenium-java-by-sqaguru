package sqaguru.selenium.locators.tests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathLocatorTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hello world from FirstTest");

		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();

		String elementBeforeLogin = driver.findElement(By.xpath("//li[.='Log In']/preceding-sibling::li")).getText();

		System.out.println("elementBeforeLogin: " + elementBeforeLogin);

		driver.findElement(By.id("email")).sendKeys("Santosh");

		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys(Keys.BACK_SPACE);

		Thread.sleep(1000);

		driver.findElement(By.id("email")).sendKeys(Keys.BACK_SPACE);

		driver.findElement(By.id("email")).sendKeys(Keys.chord(Keys.CONTROL,"a"),"Rama");

		//driver.findElement(By.id("email")).sendKeys("Rama");

		Thread.sleep(1000);
		//driver.findElement(By.id("email")).clear();

		// explicit wait start here *************************************************
		WebDriverWait wait = new WebDriverWait(driver, 60);

		WebElement myLink = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Create New Account']")));

		wait.until(ExpectedConditions.elementToBeClickable(myLink));

		// explicit wait start here *************************************************

		myLink.click();

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		String maleFemale = "Female123";

		driver.findElement(By.xpath("//label[text()='" + maleFemale + "']/following-sibling::input")).click();

		boolean hasRadioButtonSelected = driver
				.findElement(By.xpath("//label[text()='" + maleFemale + "']/following-sibling::input")).isSelected();

		System.out.println("hasRadioButtonSelected after selection: " + hasRadioButtonSelected);

		driver.quit();

	}

}
