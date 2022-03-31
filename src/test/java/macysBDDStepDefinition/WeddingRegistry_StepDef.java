package macysBDDStepDefinition;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.WeddingRegistry_Action;
import macysBDDUtilities.Helper;

public class WeddingRegistry_StepDef {
	WeddingRegistry_Action object5=new WeddingRegistry_Action();
	@Given("User is in Macys Wedding and Registry page")
	public void user_is_in_Macys_Wedding_and_Registry_page() {
		 object5.get_Weddingpage();
	    
	}

	@When("User click on Create Your Registry")
	public void user_click_on_Create_Your_Registry() {
	    object5.create_registry();
	    
	}

	@Then("User is navigated to Create registry page")
	public void user_is_navigated_to_Create_registry_page() {
		String Confirm_registry= Helper.getPageTitle();
		String expected_regustryTitle="Create Registry - Macy’s";
		Assert.assertEquals(Confirm_registry, expected_regustryTitle);
	    
	    
	}

	@When("Input valid email")
	public void input_valid_email() {
	    object5.putEmail();
	    
	}

	@When("Input password")
	public void input_password() {
		object5.putPassword();
	    
	    
	}

	@When("Input password again")
	public void input_password_again() {
	    object5.reentrypass();
	    
	}

	@When("Click and Select a security question from dropdown")
	public void click_and_select_a_security_question_from_dropdown(){
		object5.SecurityQuestion();
		
}

	@When("Input a answer")
	public void input_a_answer() {
		object5.QuestionAnswer();
	    
	    
	}

	@When("Click on Continue")
	public void click_on_Continue() {
	    object5.Click_continue();
	    
	}
	@Then("User is directed to the personal info page to add more info")
	public void user_is_directed_to_the_personal_info_page_to_add_more_info() {
	    object5.additional_info();
	}


}
