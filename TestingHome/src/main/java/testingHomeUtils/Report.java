package testingHomeUtils;


import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class Report {
	ExtentHtmlReporter html;
	ExtentReports extent;
	ExtentTest suiteTest,test;
	public String testCaseName, testNodes, testDescription, category, authors;
	
	//BeforeSuite
	public void beginResult() {
		html = new ExtentHtmlReporter("./extentReports/reports.html");
		html.setAppendExisting(false);
		extent = new ExtentReports();
		extent.attachReporter(html);
		
	}
//BeforeClass
public void startTestModule(String testCaseName,String testDescription) {
		suiteTest = extent.createTest(testCaseName,testDescription);
}

	//BeforeMethod
	public ExtentTest startTestCases() {
		
		test = suiteTest.createNode(testNodes);
		return test;
		//test.assignAuthor("Krishnakumar Sivraman");
		//test.assignCategory("Smoke");
	}
	
	public abstract long takeSnap();
	
	//AfterSuite
	public void testEnds() {
		extent.flush();
	}
	int i=1;
	public void reports(String desc , String Status, boolean bsnap ) {
		MediaEntityModelProvider img = null;
		if(bsnap && !Status.equalsIgnoreCase("INFO")) {
			long snapNumber = 100000L;
			snapNumber = takeSnap();
			try {
			img = MediaEntityBuilder.createScreenCaptureFromPath
					("./../reports/images/"+snapNumber+".jpg").build();
		
			/*if(Status.equalsIgnoreCase(Status)) {
				test.pass(desc,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/guru1"+i+".png").build());
			}else if(Status.equalsIgnoreCase(Status)) {
				test.fail(desc,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/guru"+i+".png").build());
			}
			i++;*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		if(Status.equalsIgnoreCase("PASS")) {
			test.pass(desc, img);			
		}else if (Status.equalsIgnoreCase("FAIL")) {
			test.fail(desc, img);
			throw new RuntimeException();
		}else if (Status.equalsIgnoreCase("WARNING")) {
			test.warning(desc, img);
		}else if (Status.equalsIgnoreCase("INFO")) {
			test.info(desc);
		}						
	}
	public void reportStep(String desc, String status) {
		reportStep(desc, status);
	}




	public void endResult() {
		extent.flush();
	}	



}
