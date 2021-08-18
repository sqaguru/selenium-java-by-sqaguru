package sqaguru.selenium.webelement.selecttests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import sqaguru.framework.base.Base;

public class WebElements extends Base {

	@Test
	public void webElementTest() throws InterruptedException {

		driver.get("https://www.facebook.com/");// navigate to taret url

		// driver.findElement(By.linkText("Create New Account")).click();

		driver.findElement(By.partialLinkText("New Account")).click();

		System.out.println("Clicked on create facebook account button");

		Thread.sleep(5000);

		Select selectDay = new Select(driver.findElement(By.id("day")));

		selectDay.selectByValue("22");

		Select selectMonth = new Select(driver.findElement(By.id("month")));

		selectMonth.selectByVisibleText("Mar");

		System.out.println("_____________________________________________________");

		List<WebElement> selectedOptions = selectMonth.getAllSelectedOptions();

		for (WebElement webElement : selectedOptions) {
			System.out.println(webElement.getText());
		}

		System.out.println("_____________________________________________________");

		List<WebElement> options = selectMonth.getOptions();

		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}

		Select selectYear = new Select(driver.findElement(By.id("year")));

	}

}
