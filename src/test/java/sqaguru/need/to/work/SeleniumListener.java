package sqaguru.need.to.work;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;

public class SeleniumListener implements WebDriverEventListener {

	public void afterAlertAccept(WebDriver arg0) {
		Reporter.log("Done: Accepting alert box");
		Reporter.log("Done: Accepting alert box", true);
	}

	public void afterAlertDismiss(WebDriver arg0) {
		Reporter.log("Done: Dismissed alert box");
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		Reporter.log("Done: textbox value changed to '" + arg2 + "'");

	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		Reporter.log("Done: clicked on element '" + arg0.getText() + "'");

	}

	
	public void afterFindBy(By locator, WebElement arg1, WebDriver arg2) {
		Reporter.log("Done: element found using locator '" + locator + "'");
	}

	
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		Reporter.log("Done: screenshot captured");

	}

	
	public void afterGetText(WebElement arg0, WebDriver arg1, String text) {
		Reporter.log("Done: element text captured as " + text);

	}

	
	public void afterNavigateBack(WebDriver driver) {
		Reporter.log("Done: browser navigated backword and the current title is " + driver.getTitle());

	}

	
	public void afterNavigateForward(WebDriver driver) {
		Reporter.log("Done: browser navigated forward and the current title is " + driver.getTitle());

	}

	
	public void afterNavigateRefresh(WebDriver driver) {
		Reporter.log("Done: browser refreshed and the current title is " + driver.getTitle());

	}

	
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		Reporter.log("Done: browser navigated to " + arg0 + " with title " + arg1.getTitle());

	}

	
	public void afterScript(String arg0, WebDriver arg1) {
		Reporter.log("Done: script executed  " + arg0);

	}

	
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		Reporter.log("Done: switched  to window " + arg0 + " and title " + arg1.getTitle());

	}

	
	public void beforeAlertAccept(WebDriver arg0) {
		Reporter.log("Info: about to accept alert box..");

	}

	
	public void beforeAlertDismiss(WebDriver arg0) {
		Reporter.log("Info: about to dismiss alert box..");

	}

	
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		Reporter.log("Info: about to type text '" + arg2 + "'..");

	}

	
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		Reporter.log("Info: about to click element '" + arg0.getText() + "'..");

	}

	
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		Reporter.log("Info: finding for element by locator '" + arg0 + "'..");

	}

	
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		Reporter.log("Info: captuing the screenshot..");

	}

	
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		Reporter.log("Info: getting text from element '" + arg0.getText() + "'..");

	}

	
	public void beforeNavigateBack(WebDriver arg0) {
		Reporter.log("Info: navigating browser backward..");

	}

	
	public void beforeNavigateForward(WebDriver arg0) {
		Reporter.log("Info: navigating browser forward..");

	}

	
	public void beforeNavigateRefresh(WebDriver arg0) {
		Reporter.log("Info: refreshing browser..");

	}

	
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		Reporter.log("Info: navigating to '" + arg0 + "'..");

	}

	
	public void beforeScript(String arg0, WebDriver arg1) {
		Reporter.log("Info: executing script '" + arg0 + "'..");

	}

	
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		Reporter.log("Info: switching window '" + arg0 + "'..");

	}

	
	public void onException(Throwable arg0, WebDriver arg1) {
		Reporter.log("Error: Exception occured..");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
