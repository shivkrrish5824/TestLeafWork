package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class MyContacts  extends ProjectMethods{
	
	public MyContacts() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Contact")
	WebElement eleClickCont;
	@Then("click on Create Contact")
	public CreateContactForm clickCreateCon() {
		click(eleClickCont);
		return new CreateContactForm();
	}
}
