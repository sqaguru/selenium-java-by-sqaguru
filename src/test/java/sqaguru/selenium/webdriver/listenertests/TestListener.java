package sqaguru.selenium.webdriver.listenertests;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class TestListener implements WebDriverEventListener {

	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("DONE: Alert accepted successfully.");

	}

	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println("DONE: Alert dismissed successfully");

	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("DONE: Element value changed to " + arg2);

	}

	public void afterClickOn(WebElement webElement, WebDriver arg1) {
		System.out.println("DONE: Clicked on button " + webElement.getText());

	}

	public void afterFindBy(By by, WebElement arg1, WebDriver arg2) {
		System.out.println("DONE: Element found by " + by);

	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub

	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void beforeAlertAccept(WebDriver arg0) {
		System.out.println("WAIT FOR:  for accepting an alert..");

	}

	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] testData) {
		System.out.println("WAIT FOR: Typing text on input element " + testData);

	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("WAIT FOR: Clicking on element.. " + arg0.getText());

	}

	public void beforeFindBy(By by, WebElement arg1, WebDriver arg2) {
		System.out.println("WAIT FOR: Finding an element by '" + by + "'..");

	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		System.out.println("WAIT FOR: Getting the text from element.." + arg0.getTagName());

	}

	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("ERROR: Exception occured..");

	}

}
