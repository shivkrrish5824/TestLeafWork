package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import pages.CreateLeadForm;
//import pages.HomePage;
import pages.LoginPage;
//import pages.MyHome;
//import pages.MyLeads;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC002";
		testDescription = "Leads Created to LeafTaps";
		testNodes = "CreateLeads";
		category = "smoke";
		authors = "Krishna";
		dataSheetName  = "TC002";
		
	}
	//@Parameters({"uName","pwd"})
	//@BeforeMethod(groups="smoke")
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd, String CName, String Fname, String Lname){
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin().clickCRM()
		.clickLeads().createLead()
		.companyName(CName)
		.firstName(Fname)
		.lastName(Lname)
		.submitCreateLead();
		/*new HomePage().clickCRM();
		new MyHome().clickLeads();
		new MyLeads().createLead();
		new CreateLeadForm().
		CompanyName(CName).FirstName(Fname).LastName(Lname).SubmitCreateLead();*/
		
	}

}
