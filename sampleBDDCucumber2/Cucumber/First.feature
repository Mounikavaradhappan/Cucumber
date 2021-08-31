Feature: test the myhcl application
Scenario: test the login page with valid credentials 
Given open chrome browser and url of the application
When Enter username and password  
Then Login success

Scenario: test the itime page 
Given open chrome browser and myhcl
When Enter username1 and password1  
Then Enter itime in text search box
And Enter time in timesheet
And Save the time