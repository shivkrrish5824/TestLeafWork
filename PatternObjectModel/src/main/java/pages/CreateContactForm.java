package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateContactForm extends ProjectMethods{
	
	public CreateContactForm() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how=How.ID,using="firstNameField")
	WebElement eleFname;
	@Then("Fill First Name (.*)")
public CreateContactForm Fname(String Data) {
type(eleFname,Data);
return this;
}
@FindBy(how=How.ID,using="lastNameField")
WebElement eleLname;
@Then("Fill Last Name (.*)")
public CreateContactForm Lname(String Data) {
	type(eleLname,Data);
	return this;
}
@FindBy(how=How.CLASS_NAME,using="smallSubmit")
WebElement eleSubmitCon;
@When("click Create Contact Submit")
public ViewContact SubmitContact() {
	click(eleSubmitCon);
	return new ViewContact();
	
}
}
