Feature: Seach Functionality


Background:
Given User opens the application

Scenario: Search for a valid product 
When User enters valid product into search field
And User clicks on search button
Then User should see a valid product displayed in search result 

Scenario: Search for a non-existing product
When User enter a non-existing product into the search field
And User clicks on search button
Then User should get proper notification about the product not matching displayed 

Scenario: Seach without providing any product 
When User does not enter any search key in the search field
And User clicks on search button
Then User should get proper notification about the product not matching displayed 