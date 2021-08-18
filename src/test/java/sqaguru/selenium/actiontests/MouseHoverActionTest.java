package sqaguru.selenium.actiontests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionTest {

	public static void main(String[] args) throws InterruptedException, AWTException {

		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://demoqa.com/tool-tips");// test

			Thread.sleep(2000);

			Actions action = new Actions(driver);

			action.moveToElement(driver.findElement(By.xpath("//button[@id='toolTipButton']"))).build().perform();

			Thread.sleep(5000);

			Action clickSecondMouseHover = action
					.moveToElement(driver.findElement(By.xpath("//input[@id='toolTipTextField']"))).build();

			clickSecondMouseHover.perform();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='tooltip-inner']")).click();

			Thread.sleep(2000);

			action.contextClick(driver.findElement(By.xpath("//div[@class='header-text']"))).build().perform();
			Thread.sleep(2000);

			
			
			driver.quit();

			
			
			
			
			
			
			
//			String defaultWindow = driver.getWindowHandle();
//
//			System.out.println("defaultWindow ID:" + defaultWindow);
//
//			Set<String> windows = driver.getWindowHandles();
//
//			for (String window : windows) {
//				if (!window.equals(defaultWindow)) {
//
//					driver.switchTo().window(window);
//				}
//			}
//			String newWindowURL = driver.getCurrentUrl();
//			System.out.println("The new windows URL is:" + newWindowURL);
//
//			driver.close();
//			
//            Thread.sleep(2000);
//			driver.switchTo().window(defaultWindow);
//
//			String defaultWindowsTitle = driver.getTitle();
//
//			System.out.println("defaultWindowsTitle:" + defaultWindowsTitle);
//
//			System.out.println("proceeding with rest of script");

		}
	}
}
