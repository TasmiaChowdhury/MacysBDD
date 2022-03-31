package macysBDDStepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import io.cucumber.java.en.*;
import macysBDDActions.SignIn_actions;
import macysBDDUtilities.Helper;

public class SignInStepDefinations {
	
	SignIn_actions action = new SignIn_actions();

	@Given("User is on Macys sign is page")
	public void user_is_on_Macys_sign_is_page() {
		action.openMacysSignin();	
	}

	@When("User enters a invalid email address")
	public void user_enters_a_valid_email_address() throws InterruptedException {
		action.clearEmailID();
		action.inputEmail();
		System.out.println("Calling input email method");
	}

	@And("User enters a Valid password")
	public void user_enters_a_Valid_password() {
		action.clearPassword();
		action.inputPass();
		System.out.println("calling input password method ");
	}

	@And("User clicks on sign-in")
	public void user_clicks_on_sign_in() {
		action.clickSignin();

	}
	
	@Then("User should not be nevigated to Macys homepage")
	public void user_shouldnot_be_nevigated_to_Macys_homepage() {
		Assert.assertEquals(Helper.getCurentUrl(), "https://www.macys.com/account/signin");
		
	}
	
	@Then("User  should receive an error message")
	public void user_should_receive_an_error_message() {
		boolean actual = action.errormessage();
		Assert.assertEquals(actual, true);
	}




}
