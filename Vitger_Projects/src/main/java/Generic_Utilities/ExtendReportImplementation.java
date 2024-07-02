package Generic_Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ExtendReportImplementation implements ITestListener {
	 ExternRep reports;
	ExternTest test;

	
	public void onTestStart(ITestResult result) {
		
		test=report.createTest(result.getMethod().getMethodName());
	}

	
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable();
	}

	
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable();
		System.out.println("<............I am Listening........>");
		
		String screenShot=null;
		
		try
		{
		screenshot =WebDriver_utility.takeScreenShot(BaseClass.class.Driver,result.getMethod().getMethodName());
	     	
	}


	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,result.getMethod.getMethodName());
	}

	
	public void onStart(ITestContext context) {
		new ExtentSparkReporter"ExtentReports/report.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Testing");
		spark.config().setReportName("Anitha");
		
		report=new ExternReports();
		
		report.attachReporters(spark);
		report.setSystemInfo("platform","windows10");
		report.setSystemInfo("executed by","anitha");
		report.setSystemInfo("reieved by","gowda");
		
		
	}

	
	public void onFinish(ITestContext context) {
		
		ITestListener.super.onFinish(context);
	}
	

}
