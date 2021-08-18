package sqaguru.selenium.switchcommand.tests;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchToFrameTest {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.out.println("hello world from FirstTest");

		System.setProperty("webdriver.chrome.driver",
				"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		/*
		 * driver = new FirefoxDriver(); driver = new InternetExplorerDriver();
		 */

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		driver.manage().window().maximize();

		int totalFrames = driver.findElements(By.tagName("iframe")).size();

		System.out.println("totalFrames: " + totalFrames);

		takeScreenShot(driver, "screen_1");

		driver.switchTo().frame("packageListFrame");

		List<WebElement> linksOnPackageListFrame = driver.findElements(By.tagName("a"));

		System.out.println("total links on Package List Frame " + linksOnPackageListFrame.size());

		for (WebElement link : linksOnPackageListFrame) {
			System.out.println(link.getText());
		}

		driver.switchTo().defaultContent();

		takeScreenShot(driver, "screen_2");

		System.out.println("_________________________________________________________");

		driver.switchTo().frame("packageFrame");

		List<WebElement> linksOnPackageFrame = driver.findElements(By.tagName("a"));

		System.out.println("total links on Package List Frame " + linksOnPackageFrame.size());

		takeScreenShot(driver, "screen_3");

		for (WebElement link : linksOnPackageFrame) {
			System.out.println(link.getText());
		}
	}

	private static void takeScreenShot(WebDriver driver, String fileName) {
		// takeScreenShot class
		// WebDriver - Interface => ChromeDriver, FireFoxDriver, InternetExplorer
		// WebElement
		// Select
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destFile = new File(
				"D:\\sqa-guru\\sel-bat-feb21\\sel-bat-feb21\\resources\\screenshots\\" + fileName + ".PNG");

		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			System.out.println("Exception occured while screen capture");
		}

	}

}
