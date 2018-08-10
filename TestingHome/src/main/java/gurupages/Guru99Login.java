package gurupages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdTestingHomeMethods.ProjectMethods;

public class Guru99Login extends ProjectMethods {

	public Guru99Login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.NAME,using="uid")
	WebElement eletypeUsername;
	public Guru99Login typeUsername() {
		type(eletypeUsername,"mngr145184");
		return this;
		
	}
	@FindBy(how=How.NAME,using="password")
	WebElement eletypePassword;
	public Guru99Login typePassword() {
		type(eletypePassword,"qAvYrUm");
		return this;
	}
	@FindBy(how=How.NAME,using="btnLogin")
	WebElement eleclickLogin;
	public Guru99HomePage ClickLogin() {
		click(eleclickLogin);
		return new Guru99HomePage();
		
	}
}
