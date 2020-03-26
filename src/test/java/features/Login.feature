Feature: Application Login

Scenario: Landing on the Home Page
Given User is on the Login Page
When User logins in the application with proper username "abhipatel4592@gmail.com" and password "Abhishekpatel!123"
Then Home page is populated
And profile is displayed "True"


Scenario: Not Landing on the Home Page
Given User is on the Login Page
When User logins in the application with proper username "patelabhi4592@gmail.com" and password "Abhishel!123"
Then Home page is populated
And profile is displayed "False"
