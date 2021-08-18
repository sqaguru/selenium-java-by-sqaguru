package sqaguru.need.to.work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTest {
	@Test
	public void ActionTest() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.out.println("hello world from FirstTest");

		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/droppable/");

		WebElement sourceElement = driver.findElement(By.id("draggable"));

		WebElement destElement = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		action.dragAndDrop(sourceElement, destElement).build().perform();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Santosh");

		WebElement loginLink = driver.findElement(By.linkText("Log In"));

		action.contextClick(loginLink).build().perform();

		Thread.sleep(2000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER);

	}

}
