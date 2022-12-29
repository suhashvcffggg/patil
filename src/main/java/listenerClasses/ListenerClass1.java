package listenerClasses;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.Base1;

public class ListenerClass1 implements ITestListener{
	
	ExtentTest extentTest;
	
	
	 public void onTestStart(ITestResult result) {
		 extentTest = Base1.getAlreadyExsistTest();
		 extentTest.log(Status.INFO, "Test : Started"+result.getName());
		 System.out.println("Test started "+ result.getName() + " From listener");
		 Reporter.log("Test started");
	}
	 
	 public void onTestSuccess(ITestResult result) {
		 extentTest.log(Status.PASS, "Test : Passed"+result.getName());
		 System.out.println("Test Passed "+ result.getName()+ " From listener");
		 Reporter.log("Test Passed");
	}

		  
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "Test : Failed"+result.getName());
		System.out.println("Test Failed "+ result.getName()+ " From listener");
		 Reporter.log("Test Failed");
	}

		
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Test : Skipped "+result.getName());
		System.out.println("Test Skipped "+ result.getName()+ " From listener");
		 Reporter.log("Test skipped");
	}

}
