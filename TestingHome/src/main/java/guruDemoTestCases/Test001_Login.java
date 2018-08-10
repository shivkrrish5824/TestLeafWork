package guruDemoTestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import gurupages.Guru99Login;
import wdTestingHomeMethods.ProjectMethods;

public class Test001_Login extends ProjectMethods{
	
	
@BeforeTest
	
	public void setdata() {
	browserName = "firefox";
}

	
	@Test
	public void login() {
		new Guru99Login()
		.typeUsername().typePassword().ClickLogin();
	}

}
