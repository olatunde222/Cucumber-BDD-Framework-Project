Feature: User Registration

Background:
Given User navigates to Register Account Page

Scenario: Register with mandatory fields
When User enters firstname "Arun" into the first Name field
And User Enters lastname "Motoori" into the last Name field
And User Enters email address "arun.motoori@gmial.com" into the email field
And User Enters telephone "12345676890" into the telephone field
And User enters password "12345" into the password field
And User re-enters password "12345" into the re-confirm password field
And User Selects Privacy Policy field
And User clicks on Continue button
Then Account should be creatred successfully

Scenario: Register with all fields
When User enters firstname "Arun" into the first Name field
And User Enters lastname "Motoori" into the last Name field
And User Enters email address "arun.motoori@gmial.com" into the email field
And User Enters telephone "12345676890" into the telephone field
And User enters password "12345" into the password field
And User re-enters password "12345" into the re-confirm password field
And User Selects Yes for newsletter
And User Selects Privacy Policy field
And User clicks on Continue button
Then Account should be creatred successfully

Scenario: Register without providing any fields
When User doesnt provide any detail in the fields
And User clicks on Continue button
Then User should get warning message for all the mandatory fields

Scenario: Register with existing email address
When User enters firstname "Arun" into the first Name field
And User Enters lastname "Motoori" into the last Name field
And User Enters email address "amotooricap9@gmail.com" into the email field
And User Enters telephone "12345676890" into the telephone field
And User enters password "12345" into the password field
And User re-enters password "12345" into the re-confirm password field
And User Selects Yes for newsletter
And User Selects Privacy Policy field
And User clicks on Continue button
Then User should get a warning message notifying the duplicate email address