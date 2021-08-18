package sqaguru.selenium.crossbrowser.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class CrossBrowserTest {

	WebDriver driver;

	@BeforeTest
	//@Parameter("browser")
	public void setup(String browser) throws Exception {
		// chel if parameter passed from TestNG is 'firefox'

		if (browser.equalsIgnoreCase("firefox")) {
			// create firefox instance
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Guru\\AppData\\Local\\Temp\\geckodriver-v0.29.1-win64.zip\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		// check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {

			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver",
					"D:\\\\sqa-guru\\\\sel-bat-feb21\\\\sel-bat-feb21\\\\resources\\\\drivers\\\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			// if no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testParameterWithXML() throws InterruptedException {

		driver.get("https://www.inflectra.com/");
		WebElement Login = driver.findElement(By.linkText("//a[@id='navLoginBtn']"));

		// Hit login Button
		Login.clear();
		Thread.sleep(4000);
		WebElement userName = driver.findElement(By.id("//input[@id='cplMainContent_LoginUser_UserName']"));
		// Fill user name

		userName.sendKeys("vishals.sqa@gmail.com");
		Thread.sleep(4000);

		WebElement password = driver.findElement(By.id("//input[@id='cplMainContent_LoginUser_Password']"));
		// fill password
		password.sendKeys("12345678");
		Thread.sleep(6000);

		WebElement Next = driver.findElement(By.id("//input[@id='cplMainContent_LoginUser_btnLogIn']"));
		// Hit search button
		Next.click();
		Thread.sleep(4000);

		WebElement search = driver.findElement(By.id("//input[@id='btn-global-search']"));
		search.sendKeys("Selenium");
		// Hit search button
		Thread.sleep(4000);

	}

}
