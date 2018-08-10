package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT, using="Create Lead")
	WebElement eleClickCreateLead;
	@Then("click on CreateLead")
	public CreateLeadForm createLead() {
		click(eleClickCreateLead);
		return new CreateLeadForm();
	}
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	WebElement eleClickMerge;
	public CreateMergeForm MergeLead() {
		click(eleClickMerge);
		return new CreateMergeForm();
	}

}
