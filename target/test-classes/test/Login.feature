Feature: User Login
Registered User should be able to login to access account information

Background:
Given User navigates to login page

Scenario Outline: Login with valid credentials
When User enters valid email address <email>
And User enters valid password <password>
And User clicks on Login button 
Then User should be able to login successfully 
Examples:
|email									|password|
|amotooricap9@gmial.com |12345|
|amotooricap3@gmial.com |12345|
|amotooricap1@gmial.com |12345|

Scenario: Login in with invalid credentials 
When User eneters invalid email address " amotooricap9999999@gmial.com"
And User enters invalid password " 12345677777" 
And User clicks on Login button 
Then User should not be able to login
And User should see a proper warning message displayed

Scenario: Login with valid email and invalid password
When User enters valid email address " amotooricap9@gmial.com"
And User enters invalid passoword " 12345677777" 
And User clicks on login button
Then User should not be able to login successfully 
And User should see proper warning error message displayed

Scenario: Login with invalid email and valid password
When User enters invalid email address " amotooricap9999999@gmial.com"
And User enters invalid passoword " 12345" 
And User clicks on login button
Then User should not be able to login successfully 
And User should see proper warning error message displayed

Scenario: Login without providing any credentials
When User does not provide any login credentials
And User clicks on login button
Then User should not be able to login successfully 
And User should see proper warning error message displayed