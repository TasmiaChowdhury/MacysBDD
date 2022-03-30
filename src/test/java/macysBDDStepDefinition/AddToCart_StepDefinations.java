package macysBDDStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.AddToCard_actions;

public class AddToCart_StepDefinations {
	
	AddToCard_actions action=new AddToCard_actions();
	
	@Given("User is on {string}")
	public void user_is_on(String string) {
		action.openShoesPage();
		action.systemerror();
		
	    
	}

	@When("User sort item by best seller from dropdown menu")
	public void user_sort_item_by_best_seller_from_dropdown_menu() {
		action.dropdownMenu();
	    
	}

	@Then("user is able to see item based on best seller filter")
	public void user_is_able_to_see_item_based_on_best_seller_filter() {
	    
	}

	@When("User clicks on an item")
	public void user_clicks_on_an_item() {
		action.clickInShoe();
	    
	}

	@And("User choose a color")
	public void user_choose_a_color() {
		action.selectColor();
	    
	}

	@And("User choose a size")
	public void user_choose_a_size() {
	  action.selectSize(); 
	  action.cookiesHandle();
	}

	@And("User Clicks on Add to bag")
	public void user_Clicks_on_Add_to_bag() {
		action.addToBag();
	    
	}

	@And("User Clicks on View bag from the new window")
	public void user_Clicks_on_View_bag_from_the_new_window() {
	    
	}

	@Then("User is able to see the item added in the bag")
	public void user_is_able_to_see_the_item_added_in_the_bag() {
	    
	}



}
