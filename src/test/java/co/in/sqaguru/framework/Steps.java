package co.in.sqaguru.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Steps {
	public void localSleep(int milliSeconds) {
		try {
			Reporter.log("waiting..", true);
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void type(WebElement stepElement, String stepData, String stepInfo) {
		Reporter.log("Verify: Typing text on inputBox '" + stepInfo + "' " + stepData, true);
		stepElement.sendKeys(stepData);
		Reporter.log("Passed: Typed text on inputBox '" + stepInfo + "' " + stepData + " successfully", true);

	}

	public void clickButton(WebElement stepElement, String stepInfo) {
		Reporter.log("Verify: Clicking on button '" + stepInfo + "' ", true);
		stepElement.click();
		Reporter.log("Passed: Clicked on button successfully'" + stepInfo + "' ", true);

	}

	public void selectByValue(Select stepElement, String stepData, String stepInfo) {
		Reporter.log("Verify: Select dropdown '" + stepInfo + "' text " + stepData, true);
		stepElement.selectByValue(stepData);
		Reporter.log("Passed: Selected dropdown '" + stepInfo + "' text " + stepData + " successfully", true);
	}

	public void selectByVisibleText(Select stepElement, String stepData, String stepInfo) {
		Reporter.log("Verify: Select dropdown '" + stepInfo + "' text " + stepData, true);
		stepElement.selectByVisibleText(stepData);
		Reporter.log("Passed: Selected dropdown '" + stepInfo + "' text " + stepData + " successfully", true);
	}
}
