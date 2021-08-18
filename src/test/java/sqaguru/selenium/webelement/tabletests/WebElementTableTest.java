package sqaguru.selenium.webelement.tabletests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementTableTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		navigateToURL();

		// driver.findElement(By.linkText("Create New Account")).click();

		Thread.sleep(5000);

		List<WebElement> table = driver.findElements(By.tagName("table"));

		String tableText;

		if (table.size() >= 2) {
			tableText = table.get(1).getText();

			int tableRowsCount = table.get(1).findElements(By.tagName("tr")).size();

			System.out.println("tableRowsCount: " + tableRowsCount);

			int totalColumnsCount = table.get(1).findElements(By.xpath("//td")).size();

			System.out.println("totalColumnsCount: " + totalColumnsCount);

		} else {
			tableText = table.get(0).getText();
		}

		System.out.println(tableText);

	}

	public static void navigateToURL() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\workspace_bat202012147PM\\selenium-automation-by-sqaguru\\resources\\webdriver\\chromedriver.exe");

		driver = new ChromeDriver();// launching the chrome browser

		driver.get(
				"https://www.amazon.in/?ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_CjwKCAiAirb_BRBNEiwALHlnDyiHcu9wgfV3Efwertzu_7uMVOCnXUPFwPVEZeBwXaN5i2_wTTjKkRoC4b4QAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAiAirb_BRBNEiwALHlnDyiHcu9wgfV3Efwertzu_7uMVOCnXUPFwPVEZeBwXaN5i2_wTTjKkRoC4b4QAvD_BwE");// navigate
																																																																									// to
																																																																									// taret
																																																																									// url

	}

}
