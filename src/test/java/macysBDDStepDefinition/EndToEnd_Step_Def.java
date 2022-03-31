package macysBDDStepDefinition;


import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.EndToEnd_Actions;
import macysBDDUtilities.Helper;

public class EndToEnd_Step_Def {
	
	EndToEnd_Actions eTeActions= new EndToEnd_Actions();
	
	@Given("User is on Macys.com home page.")
	public void user_is_on_Macys_com_home_page() {
		eTeActions.Macys();
		eTeActions.cokies();
	
		
	}

	@When("Click on Men")
	public void click_on_Men() {
		eTeActions.Click_men();
	    
	}

	@When("Click on Shirt")
	public void click_on_Shirt() {
		eTeActions.Click_Shirt();
		eTeActions.systemerror();
		
	    
	}

	@When("Click on desired shirt")
	public void click_on_desired_shirt() {
		eTeActions.Click_desired_shirt();
	    
	}

	@When("Click color black")
	public void click_color_black() {
	    eTeActions.Click_color_black();
	    
	}

	@When("Click on size S")
	public void click_on_size_S() {
		eTeActions.Click_size_S();
	    
	}

	@When("Click on Add To Bag")
	public void click_on_Add_To_Bag() {
		eTeActions.Click_Add_To_Bag();
		eTeActions.crosserror();
		eTeActions.Click_Add_To_Bag();
	    
	}

	@When("Click Checkout")
	public void click_Checkout() {
		eTeActions.Click_Checkout();
	    
	}

	@Then("user able to checkout successfully")
	public void user_able_to_checkout_successfully() {
		String actualTitle = Helper.getPageTitle();
		String expectedTitle = "Macy's Shopping Bag";
		assertEquals(expectedTitle,actualTitle);
	    
	    
	}
	
}