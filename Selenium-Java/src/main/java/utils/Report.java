package utils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public abstract class Report  {
	ExtentReports extent;
	ExtentTest SuiteTest, test;
	
	public abstract void takesnap();
	//BeforeSuite
	public void beginResult() {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/createContact.html");
		html.setAppendExisting(false);
		
		extent = new ExtentReports();
		extent.attachReporter(html);
	}
	//BeforeClass
	public void startTestCases() {
		SuiteTest = extent.createTest("TC000_CreateContact","New Login created in leaftaps");
	}
	
	//BeforeMethod
	public void startSubTestCases() {
		test = SuiteTest.createNode("Contacts");
		test.assignAuthor("Krishna");
		test.assignCategory("sanity");
	}
	//AfterSuite
	public void resultEnd() {
		extent.flush();
	}
	
	public void reports(String dec, String Status) {
		try {
			if(Status.equalsIgnoreCase(Status)){
				test.pass(dec,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());	
			}else if(Status.equalsIgnoreCase(Status)) {
				test.fail(dec,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
