Feature: Deal with Leaftaps Leads

Scenario Outline: Create Lead in Leaftaps

#Given Launch the browser
#Given Load the URL
#Given Set Implicitly Wait
#Given Maximize the Page
Given Enter Username as <username>
Given Enter Password as <password>
When click Login button
Then Click CRMSFA
Then Click on Lead
Then click on CreateLead
Then Fill the Company Name <cName>
Then Fill the First Name <fName>
Then Fill the Last Name <lName>
When click Create Lead Submit
#But verfy the Text
#Then Close the Browser

Examples:

|username|password|cName|fName|lName|
|DemoSalesManager|crmsfa|ShipNShore.inc|Krishnakumar|Sivaraman|
|DemoCSR|crmsfa|Mahle|Krishnakumar|Sivaraman Chetty|

