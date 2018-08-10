package rC;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/features/Contacts.feature"},
glue= {"pages","rC"},strict=true,plugin= {"html:target/reports"},monochrome= true)
public class runnerClass {
	
	public void runJUnit() {
		
	}

}
