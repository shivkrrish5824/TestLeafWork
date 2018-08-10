package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class MyHome extends ProjectMethods{
	
	public MyHome() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement eleLeads;
	@Then("Click on Lead")
	public MyLeads clickLeads() {
		click(eleLeads);
		return new MyLeads();
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Contacts")
	WebElement eleClickConlink;
	@Then("Click on Contacts")
	public MyContacts clickcontactlink(){
	click(eleClickConlink);
	return new MyContacts();

}
	
}

