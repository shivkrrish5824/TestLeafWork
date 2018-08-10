package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	/*RemoteWebDriver  driver;
	@Given("Launch the Browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And("Load the Url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Set Implicity Wait")
	public void setImplicitlyWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Maximize the page")
	public void maximizePage() {
		driver.manage().window().maximize();
	}
	@And("enter Username as (.*)")
	public void userName(String Data) {
		driver.findElementById("username").sendKeys(Data);;
	}
	@And("enter Password as (.*)")
	public void password(String Data) {
		driver.findElementById("password").sendKeys(Data);;
	}
	@When("Click Login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit");
	}
	@But("Verify the Error")
public void verifydata() {
		String text = driver.findElementByXPath("//div[@id='errorDiv']").getText();
		if(text.contains("The Following Errors Occurred:")) {
	//System.err.println("error msg successfull");
			System.out.println("error msg successfull");
}else {
	System.out.println("error msg not successfull");
}
		
}
	@Then("Close browser")
	public void closeBrowser() {
		driver.close();
	}*/
	
	
}
	
