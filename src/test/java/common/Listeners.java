package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("Test is going to start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Successfully completed");

	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Something went wrong");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	
	public void onFinish(ITestContext context) {
		System.out.println("Concluded");

	}

}
