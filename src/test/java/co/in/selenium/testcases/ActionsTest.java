package co.in.selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTest {
	@Test
	public void dragAndDropTest() throws InterruptedException {
		System.out.println("Hello from dragAndDropTest");
		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/droppable/");
		
		WebElement srcWe=driver.findElement(By.id("column-b"));
		
		WebElement destWe=driver.findElement(By.id("column-a"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(srcWe, destWe);
		
		Thread.sleep(5000);
		
		
		
	}
}
