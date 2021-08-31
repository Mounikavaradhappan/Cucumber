package Myhcllistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listener extends Itime implements ITestListener {

	ExtentReports extent = Extentreports.CreateTest();
    ExtentTest test;
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		extent.flush();
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		test = extent.createTest("Test_Myhcl");
		 test.assignAuthor("Mounika");

		 


	        test.assignCategory("Itime Testing");
	        
	        System.out.println("Test Started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		 test.fail("Myhcl login not Executed");
	        test.fail("Not able to enter itime in textsearch");
	        test.fail("Timesheet data not saved Successfully");
	        
	        System.out.println("login is failed");
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.print("Test started successfully");
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		test.pass("Myhcl login Executed");
        test.pass("enter itime in textsearch");
        test.pass("Save the itime");
	}

}
