package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_MergeLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC003";
		testDescription = "Merge Created to LeafTaps";
		testNodes = "MergeLeads";
		category = "smoke";
		authors = "Krishna";
		dataSheetName  = "TC003";
		
	}
	
	
	@Test(dataProvider="fetchData")
	public void mergeLead(String UserName, String pwd, String FindName, String FindLstName ) {
		new LoginPage().typeUserName(UserName).typePassword(pwd)
		
		.clickLogin().clickCRM().clickLeads().MergeLead().ClickMergeFindTo()
		.findName(FindName).findLastName(FindLstName)
		.clickFindLeads().clicklink()
		.ClickMergeLeadTo()
		.mergeName(FindName).clickFindLeads().clicklink()
		.submitMerge();
	}

}
