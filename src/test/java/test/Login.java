package test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
//	Step Definition Methods
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
	  System.out.println(">> User got navigated to login Page");
	}
	
	@When("User enters valid email address (.+)")
	public void user_enters_valid_email_address(String email) {
	    System.out.println(">> User enters valid email address" + email);
	}
	
	@And("User enters valid password (.+)")
	public void user_enters_valid_password(String password) {
	     System.out.println(">> User enters valid password" + password);
	}
	
	@And("User clicks on Login button")
	public void User_clicks_on_login_button() {
	    System.out.println(">> User clicks on login Button");
	}
	
	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	    System.out.println(">> User should login successfully");
	}
	
	@When("User eneters invalid email address {string}")
	public void user_eneters_invalid_email_address(String invalidemailaddress) {
		System.out.println(">> User entered invalid emial address" + invalidemailaddress);
	}
	
	@And("User enters invalid password {string}")
	public void user_enters_invalid_password(String invalidPassword) {
		System.out.println(">> User has entered invalid emial address" + invalidPassword);
	}
	
	@Then("User should not be able to login")
	public void user_should_not_be_able_to_login() {
		System.out.println(">> User should not be able to Login");
	}
	
	@And("User should see a proper warning message displayed")
	public void user_should_see_a_proper_warning_message_displayed() {
		System.out.println(">> User got a proper warning message");
	}
	
	@When("User enters invalid passoword {string}")
	public void user_enters_invalid_passoword(String invalidPassword) {
		System.out.println(">> User entered invalid password" + invalidPassword);
	}
	
	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println(">> User clicks on login button");
	}
	
	@Then("User should not be able to login successfully")
	public void user_should_not_be_able_to_login_successfully() {
		System.out.println(">> User should not be able to Login");
	}
	
	@And("User should see proper warning error message displayed")
	public void user_should_see_proper_warning_error_message_displayed() {
		System.out.println(">> User got a proper warning message");
	}
	
	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidEmailAddress) {
		System.out.println(">> User entered invalid emial address" + invalidEmailAddress);
	}
	
	@When("User does not provide any login credentials")
	public void user_does_not_provide_any_login_credentials() {
		System.out.println(">> User didnt provide any login credentials");

	}

}
