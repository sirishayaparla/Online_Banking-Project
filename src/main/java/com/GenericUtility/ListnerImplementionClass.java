package com.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplementionClass implements ITestListener{

	ExtentReports report;
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		
		//execution starts from here		
		String methodName=result.getMethod().getMethodName();
		test = report.createTest(methodName);
		Reporter.log(methodName+"=====>Testscript excution started");
	

	}

	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		test.log(Status.PASS, methodName+"=====>Testscript execution started");
		Reporter.log(methodName+"=======>Testscript execution succesful");

		
	}

	public void onTestFailure(ITestResult result) {

		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sdriver);
		String methodName = result.getMethod().getMethodName();
	//	String fs = methodName+new JavaUtility().getSystemDate();
		File src = edriver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/"+methodName+".png");
		
		
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					}
		test.log(Status.FAIL, result.getThrowable() );
		Reporter.log("Testscript execution skipped");

	}

	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName+"======>Skipped");
		test.log(Status.SKIP, result.getThrowable() );
		Reporter.log("Testscript execution skipped");

	}

	public void onStart(ITestContext context) {
		
		//CREATE HTML REPORT
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtentReport/report.html");
			htmlreport.config().setDocumentTitle("");
			htmlreport.config().setTheme(Theme.DARK);
			htmlreport.config().setReportName("Banking");
			
			 report = new ExtentReports();
			 report.attachReporter(htmlreport);
			 report.setSystemInfo("Base_Browser", "chrome");
			 report.setSystemInfo("OS", "Windows");
			 report.setSystemInfo("Base_URL", "http://rmgtestingserver/domain/Online_Banking_System/");
			 report.setSystemInfo("Report_Name", "sirish");

	}

	public void onFinish(ITestContext context) {
		//cpnsolidate the report
		report.flush();

	}

}
