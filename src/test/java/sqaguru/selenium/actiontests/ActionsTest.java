package sqaguru.selenium.actiontests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\workspace_bat202012147PM\\selenium-automation-by-sqaguru\\resources\\webdriver\\chromedriver.exe");

		driver = new ChromeDriver();// launching the chrome browser

		driver.get("https://www.testandquiz.com/selenium/testing.html");// navigate to taret
																		// url
		driver.manage().window().maximize();

		/* driver.navigate().back(); */

		Thread.sleep(5000);

		Actions action = new Actions(driver);

		action.doubleClick(driver.findElement(By.id("dblClkBtn"))).build().perform();

		Thread.sleep(3000);

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		action.contextClick(driver.findElement(By.xpath("//a[text()='This is a link']"))).build().perform();

		Thread.sleep(3000);

		// action.keyDown(Keys.DOWN).click().build().perform();

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);

		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_DOWN);

		Thread.sleep(1000);
		
		action.click().build().perform();

		Thread.sleep(3000);

		/*
		 * WebElement source = driver.findElement(By.id("sourceImage"));
		 * 
		 * WebElement target = driver.findElement(By.id("targetDiv"));
		 * 
		 * action.dragAndDrop(source, target).build().perform();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * System.out.println("execution completed successfully");
		 */

	}

}
