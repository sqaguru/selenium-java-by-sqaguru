package interviews;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.annotations.ITest;

public class Base {
	@BeforeMethod
	public void beforeMethod(ITestResult iTestResult) {
		System.out.println(
				"========================= " + iTestResult.getMethod().getMethodName() + " =========================");
	}

	public void log(String info) {
		Reporter.log(info, true);
	}

}
