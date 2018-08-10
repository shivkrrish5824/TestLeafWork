Feature: Deal with Leaftaps Contacts

Scenario Outline: Create Contacts in Leaftaps
#Given Launchbrowser
#And Load given URL
#And Apply Implicitly Wait
#And Maximize the Page
And Enter the Username as <username>
And Enter the Password as <password>
When click login button
Then Click on the CRMSFA
Then Click on Contacts
Then click on Create Contact
Then Fill First Name <fName>
Then Fill Last Name <lName>
When click Create Contact Submit
But VerifyText
#Then BrowserClose

Examples:

|username|password|fName|lName|
|DemoSalesManager|crmsfa|Krishnakumar|Sivaraman|
|DemoCSR|crmsfa|Krishnakumar|Sivaraman Chetty|

