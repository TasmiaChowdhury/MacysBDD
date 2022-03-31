package macysBDDStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.Search_actions;


public class RewardsCheck_stepDefinations {
	
	Search_actions action=new Search_actions();
	
	@Given("User is Logged in into macys's Account")
	public void user_is_Logged_in_into_macys_s_Account() {
		action.getoMacysHomePage();
	   System.out.println("Manually tested as Macys does not allow SignIn with atomation tool ");
	}

	@And("User is in Macys official website")
	public void user_is_in_Macys_official_website() {
		 System.out.println("Manually tested as Macys does not allow SignIn with atomation tool ");
	    
	}

	@When("User Clicks on Rewards from top menu bar")
	public void user_Clicks_on_Rewards_from_top_menu_bar() {
		 System.out.println("Manually tested as Macys does not allow SignIn with atomation tool ");
	}

	@Then("User is able to see User's Star Rewards")
	public void user_is_able_to_see_User_s_Star_Rewards() {
		 System.out.println("Manually tested as Macys does not allow SignIn with atomation tool ");
	}




}
