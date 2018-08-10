package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateMergeForm extends ProjectMethods{
	public CreateMergeForm() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	WebElement eleClickMergeFindTo;
	public CreateMergeForm ClickMergeFindTo() {
		click(eleClickMergeFindTo);	
		switchToWindow(1);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	WebElement eleClickMergeLeadTo;
	public CreateMergeForm ClickMergeLeadTo() {
		click(eleClickMergeLeadTo);
		switchToWindow(1);
		return this;
	}
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	WebElement eleFindName;
	public CreateMergeForm findName(String Data) {
		type(eleFindName,Data);
		return this;
		
	}
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	WebElement eleMergeName;
	public CreateMergeForm mergeName(String Data) {
		type(eleMergeName,Data);
		return this;
		
	}
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	WebElement elefindLastName;
	public CreateMergeForm findLastName(String Data) {
		type(elefindLastName, Data);
		return this;
		
	}
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	WebElement elemergeLastName;
	public CreateMergeForm mergeLastName(String Data) {
		type(elemergeLastName, Data);
		return this;
		
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement eleClickfindlead;
	public CreateMergeForm clickFindLeads() {
     click(eleClickfindlead);
     return this;
}
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[1]")
	WebElement eleclicklink;
	public CreateMergeForm clicklink() {
		click(eleclicklink);
		switchToWindow(0);
		//acceptAlert();
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Merge")
	WebElement eleSubmitMerge;
	public ViewLead submitMerge() {
		click(eleSubmitMerge);
		getAlertText();
		acceptAlert();
		return new ViewLead();
	}
}
