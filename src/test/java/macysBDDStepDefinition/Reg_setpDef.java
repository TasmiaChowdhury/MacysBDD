package macysBDDStepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.Reg_Macys_actions;

public class Reg_setpDef {
	Reg_Macys_actions Ruby_obj = new Reg_Macys_actions();

	@Given("User is on Macys sign-up page")
	public void user_is_on_Macy_s_sign_up_page() {

		Ruby_obj.getmacy_signup_page();

	}

	@When("the User inputs first name")
	public void the_User_inputs_first_name() {

		Ruby_obj.firstname();

	}

	@When("inserts last name")
	public void inserts_last_name() {

		Ruby_obj.lastname();

	}

	@When("User inserts an used email address")
	public void user_inserts_an_used_email_address() {

		Ruby_obj.Email();

	}

	@When("Inserts a password")
	public void inserts_a_password() {

		Ruby_obj.Password();

	}

	@When("User select month from the Birthday dropdown")
	public void user_select_month_from_the_Birthday_dropdown() {

		Ruby_obj.Birthmonth();
	}

	@When("Selects day from the Birthday dropdown")
	public void selects_day_from_the_Birthday_dropdown() {

		Ruby_obj.Birthday();
	}

	@When("Click on the Create Account button")
	public void click_on_the_Create_Account_button() {

		Ruby_obj.Signup();

	}

	@Then("User should receive an error message regarding used email")
	public void user_see_an_error_message_regarding_used_email() {
		boolean actual = Ruby_obj.getErrorMessage();
		Assert.assertEquals(actual, true);

	}

}
