package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class CreateContact {
	
	/*RemoteWebDriver driver;
	@Given("Launchbrowser")
	public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
		
	}
	@And("Load given URL")
	public void loadURL() {
	driver.get("http://leaftaps.com/opentaps/control/main");	
	}
	@And("Apply Implicitly Wait")
	public void setImplicitilyWait() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Maximize the Page")
	public void maxthepage() {
	driver.manage().window().maximize();	
	}
	@And("Enter the Username as (.*)")
	public void enterUserName(String Data) {
	driver.findElementById("username").sendKeys(Data);;	
	}
	@And("Enter the Password as (.*)")
	public void enterPassword(String Data) {
	driver.findElementById("password").sendKeys(Data);	
	}
	@When("click login button")
	public void clickLogin() {
	driver.findElementByClassName("decorativeSubmit").click();	
	}
	@Then("Click on the CRMSFA")
	public void clickonCRMSFA() {
	driver.findElementByLinkText("CRM/SFA").click();	
	}
	@Then("Click on Contacts")
	public void clickonContacts() {
	driver.findElementByLinkText("Contacts").click();	
	}
	@Then("click on Create Contact")
	public void clickoncreateCont() {
	driver.findElementByLinkText("Create Contact").click();	
	}
	@Then("Fill First Name (.*)")
	public void fName(String Data) {
	driver.findElementById("firstNameField").sendKeys(Data);	
	}
	@Then("Fill Last Name (.*)")
	public void Lname(String Data) {
	driver.findElementById("lastNameField").sendKeys(Data);	
	}
	@When("click Create Contact Submit")
	public void clickSubmit() {
	driver.findElementByClassName("smallSubmit").click();	
	}
	@But("VerifyText")
	public void verfytext() {
		String text = driver.findElementById("viewContact_firstName_sp").getText();
		if(text.contains("Krishna")) {
			System.out.println("Text Verified");	
		}else {
			System.out.println("Text Failed");
		}
		
		}
	@Then("BrowserClose")
	public void closeBrowser() {
		driver.close();
	}*/

}
