package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeads {
	/*RemoteWebDriver driver;
	@Given("Launch the browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Given("Load the URL")
public void loadUrl() {
	driver.get("http://leaftaps.com/opentaps/control/main");
}
	@Given("Set Implicitly Wait")
public void implicityWait() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	@Given("Maximize the Page")
public void maximizePages() {
	driver.manage().window().maximize();
}
	@Given("Enter Username as (.*)")
public void userName(String data) {
	driver.findElementById("username").sendKeys(data);
}
	@Given("Enter Password as (.*)")
public void password(String data) {
	driver.findElementById("password").sendKeys(data);
}
	@When("click Login button")
public void clickLogin() {
	driver.findElementByClassName("decorativeSubmit").click();
}
	@Then("Click CRMSFA")
public void clickCrmsfa() {
	driver.findElementByLinkText("CRM/SFA").click();
}
	@Then("Click on Lead")
	public void clickLead() {
		driver.findElementByLinkText("Leads").click();
	}
	@Then("click on CreateLead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@Then("Fill the Company Name")
	public void companyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("ShipNShore.inc");
	}
	@Then("Fill the First Name")
	public void firstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Krishna");
	}
	@Then("Fill the Last Name")
	public void lastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar S");
	}
	@When("click Create Lead Submit")
	public void sumbitLead() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@But("verfy the Text")
	public void verifyText() {
		String text=driver.findElementById("viewLead_firstName_sp").getText();
		if(text.contains("Krishna")) {
			System.out.println("Create Lead successfully Viewed[PASSED]");
		}else {
			System.out.println("Create Lead Not successfully Viewed[FAILED]");
		}
		
		}
	@Then("Close the Browser")
	public void closeBrowser() {
		driver.close();
		
		
	}*/
}
