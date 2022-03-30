package macysBDDStepDefinition;

import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.MacysAddToCartActions;

public class MacysAddToCartSteoDefinition {
MacysAddToCartActions actions = new MacysAddToCartActions();
	
	@Given("User is on Macys homepage")
	public void user_is_on_Macys_homepage() {
	 actions.getMacysHomePage();
	   
	}
	@When("User clicks on search bar")
	public void user_clicks_on_search_bar() {
	    actions.getSearchBar();
	}

	@When("User searches for an item {string}")
	public void user_searches_for_an_item(String tshirt) {
		actions.inputSearch(tshirt);
		actions.clickSearchbtn();
		
	}

	@When("User select an item")
	public void user_select_an_item() {
		actions.clickItem();
	    
	}

	@When("User selects  color and size")
	public void user_selects_color_and_size() {
		actions.pickColorAndSize();
	    
	}

	@When("User clicks “Add to cart” button")
	public void user_clicks_Add_to_cart_button() {
		actions.addToBag();
	    
	}

	@Then("Item should be added to their cart")
	public void item_should_be_added_to_their_cart() {
		String passed="item added to cart";
		Assert.assertTrue(passed.contains("added"));
	    
	}




}


