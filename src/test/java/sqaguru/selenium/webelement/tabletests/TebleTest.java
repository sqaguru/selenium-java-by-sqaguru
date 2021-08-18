package sqaguru.selenium.webelement.tabletests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TebleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hello world from FirstTest");

		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");

		driver.manage().window().maximize();

		// case(1)
		int totalColumns = driver.findElements(By.xpath("//form/table//th")).size();

		System.out.println("totalColumns: " + totalColumns);

		// case(2)

		WebElement table = driver.findElement(By.xpath("//form/table"));

		int totalHeaders = table.findElements(By.tagName("th")).size();

		System.out.println("totalHeaders: " + totalHeaders);

		List<WebElement> allRows = table.findElements(By.tagName("tr"));

		System.out.println("total rows on the table: " + allRows.size());

		totalHeaders = allRows.get(0).findElements(By.tagName("th")).size();

		System.out.println("totalHeaders: " + totalHeaders);

		List<WebElement> cells = table.findElements(By.tagName("td"));

		for (WebElement cell : cells)
			System.out.println("cell text: " + cell.getText());

		List<WebElement> headers = table.findElements(By.tagName("th"));

		for (WebElement header : headers)
			System.out.println("header text: " + header.getText());

		selectEmployee(driver, "EID001");

		Thread.sleep(2000);
		selectEmployee(driver, "EID002");
		Thread.sleep(2000);
		selectEmployee(driver, "EID003");
		Thread.sleep(2000);
	}

	private static void selectEmployee(WebDriver driver, String employeeCode) {
		driver.findElement(By.xpath("//td[text()='" + employeeCode + "']/preceding-sibling::td/input")).click();

	}

}
