package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.But;
import wdMethods.ProjectMethods;

public class ViewContact extends ProjectMethods {
	RemoteWebDriver driver;
	public ViewContact() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="viewContact_firstName_sp")
	WebElement eleVerify;
	@But("VerifyText")
	public void verifyText() {
		verifyEnabled(eleVerify);
	}

}
