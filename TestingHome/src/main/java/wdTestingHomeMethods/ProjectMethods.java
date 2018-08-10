package wdTestingHomeMethods;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



public class ProjectMethods extends SeMethods{
	public String browserName;
	public String Url;
	@BeforeSuite
	public void beforeSuite() {
		beginResult();
	}
	@BeforeClass
	public void beforeClass() {
		startTestCases();
	}
	@BeforeMethod
	public void beforeMethod() {
		
	}
  
	
	@AfterSuite
    public void afterSuite() {
    	testEnds();
    	
    }

}
