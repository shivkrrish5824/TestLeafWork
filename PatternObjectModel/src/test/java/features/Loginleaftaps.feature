Feature: Deal with LeapTaps Login Credentials 
#Background: 
    #Given Launch the Browser 
	#And Load the Url 
	#And Set Implicity Wait 
	#And Maximize the page 
@Smoke	
Scenario Outline: Login Positive 

	
	And enter Username as <username> 
	And enter Password as <password> 
	When Click Login button 
	#Then Close browser 
	
	Examples: 
		|username|password|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|
@Sanity		
Scenario Outline: Login Negative 
	And enter Username as <username> 
	And enter Password as <password> 
	When Click Login button 
	But Verify the Error 
	#Then Close browser 
Examples:
|username|password|
|krishna|crmsfa|