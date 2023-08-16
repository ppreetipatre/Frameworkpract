package UtilityLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Baselayer.Baseclass3;

public class ListnerSetup extends Baseclass3 implements ITestListener {

	ExtentReports extentreports;
	ExtentTest extenttest;
	@Override
	public  void onStart(ITestContext context) {
		extentreports = Extentreportsetup.Extentreport(context.getSuite().getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		extenttest= extentreports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS,"test is pass"+result.getMethod().getMethodName());	
		try {
			extenttest.addScreenCaptureFromPath(Extentreportsetup.Screenshot("pass", result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, "test is fail"+result.getMethod().getMethodName());
		try {
			extenttest.addScreenCaptureFromPath(Extentreportsetup.Screenshot("fail", result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP, "test is skipped"+result.getMethod().getMethodName());
	}

	

	@Override
	public void onFinish(ITestContext context) {
		//extenttest.log(Status.FAIL,"test is fail");
		System.out.println("suit ended"+"//"+context.getSuite().getName());
		extentreports.flush();
	}

}
