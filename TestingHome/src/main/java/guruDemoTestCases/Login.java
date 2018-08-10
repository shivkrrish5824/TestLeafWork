package guruDemoTestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdTestingHomeMethods.SeMethods;

public class Login extends SeMethods {
	
	@Test
	@Parameters({"Url","username","password"})
	public void guruLogin(String Url,String username, String password  ) {
		StartApp("firefox",Url);
		WebElement eleUsername = LocateElement("xpath","//input[@name='uid']");
		type(eleUsername,username);
		WebElement elePassword = LocateElement("xpath","//input[@name='password']");
		type(elePassword,password);
		WebElement eleClick = LocateElement("xpath","//input[@name='btnLogin']");
		click(eleClick);
		//getAlertText();
		//acceptAlert();
		
		
	}

}
