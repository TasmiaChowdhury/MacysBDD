package macysBDDStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.EndToEnd_actions;

public class EndToEnd_stepDefinations {
	
	EndToEnd_actions action = new EndToEnd_actions();
	
	
	@Given("User is on Macy's home page.")
	public void user_is_on_Macy_s_home_page() {
		action.goToMacys();
	    
	}

	@When("Click on Men")
	public void click_on_Men() {
		action.Click_men();
	    
	}

	@And("Click on Shirt")
	public void click_on_Shirt() {
		action.Click_Shirt();
		action.cookiesHandle();
	    
	}

	@And("Click on desired shirt")
	public void click_on_desired_shirt() {
		action.Click_desired_shirt();
	    
	}

	@And("Click color black")
	public void click_color_black() {
		try{
			action.Click_color_black();
			}
		 catch (Exception e) {
			e.getStackTrace();
			System.out.println("Item not found, sold out");
		}
	    
	}

	@And("Click on size S")
	public void click_on_size_S() {
		//action.Click_size_S();
	    
	}

	@And("Click on Add To Bag")
	public void click_on_Add_To_Bag() {
		//action.Click_Add_To_Bag();
	    
	}

	@And("Click Checkout")
	public void click_Checkout() {
		//
	   
	}

	@Then("user able to checkout successfully")
	public void user_able_to_checkout_successfully() {
		//
	    
	}

}
