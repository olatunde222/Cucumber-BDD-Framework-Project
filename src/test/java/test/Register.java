package test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

//	Step definition methods
	@Given("User navigates to Register Account Page")
	public void User_navigates_to_Register_Account_Page() {
		
	};
	
	@When("User enters firstname {string} into the first Name field")
	public void user_enters_firstname_into_the_first_name_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User Enters lastname {string} into the last Name field")
	public void user_enters_lastname_into_the_last_name_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User Enters email address {string} into the email field")
	public void user_enters_email_address_into_the_email_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User Enters telephone {string} into the telephone field")
	public void user_enters_telephone_into_the_telephone_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User enters password {string} into the password field")
	public void user_enters_password_into_the_password_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User re-enters password {string} into the re-confirm password field")
	public void user_re_enters_password_into_the_re_confirm_password_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@And("User Selects Yes for newsletter")
	public void user_selects_yes_for_newsletter() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User Selects Privacy Policy field")
	public void user_selects_privacy_policy_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Account should be creatred successfully")
	public void account_should_be_creatred_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User doesnt provide any detail in the fields")
	public void user_doesnt_provide_any_detail_in_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should get warning message for all the mandatory fields")
	public void user_should_get_warning_message_for_all_the_mandatory_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should get a warning message notifying the duplicate email address")
	public void user_should_get_a_warning_message_notifying_the_duplicate_email_address() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
