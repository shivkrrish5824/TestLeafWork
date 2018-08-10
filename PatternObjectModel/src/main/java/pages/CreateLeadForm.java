package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadForm extends ProjectMethods {
	
	

	public CreateLeadForm() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement eleCname;
	@Then("Fill the Company Name (.*)")
	public CreateLeadForm companyName(String Data){
		type(eleCname,"ShipNshore");
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	WebElement eleFname;
	@Then("Fill the First Name (.*)")
	public CreateLeadForm firstName(String Data) {
		type(eleFname,"Krishnakumar");
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement eleLname;
	@Then("Fill the Last Name (.*)")
	public CreateLeadForm lastName(String Data) {
		type(eleLname,"Sivaraman");
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	WebElement eleClickSubmit;
	@When("click Create Lead Submit")
	public ViewLead submitCreateLead() {
		click(eleClickSubmit);
		return new ViewLead();
	}
	}
