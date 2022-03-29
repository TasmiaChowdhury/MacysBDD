package macysBDDStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import macysBDDActions.ShopByDepActions;
import macysBDDUtilities.Helper;

public class ShopByDepStepDefination {
	
	ShopByDepActions action=new ShopByDepActions();
	
	@Given("user in macys homepage")
	public void user_in_macys_homepage() {
	  action.gotoMacysHomePage();  
	}

	@And("user howver over to women department")
	public void user_howver_over_to_women_department() throws InterruptedException {
		action.mouseHover();
		System.out.println("step -- mouse hover ");
	    
	}

	@And("user selected category dress")
	public void user_selected_category_dress() {
	    action.clickOndress();
	    System.out.println("steps click on dress");
	}

	@Then("user navigated to {string}")
	public void user_navigated_to(String string) {
		//String actualTitle = Helper.getPageTitle();
		//String expectedTitle = "https://www.macys.com/shop/womens-clothing/dresses?id=5449&cm_sp=us_hdr-_-women-_-5449_dresses_COL1";
		//assertEquals(expectedTitle, actualTitle);
	    System.out.println("Steps-- Navigation  to macys women's dress");
	}

	private void assertEquals(String expectedTitle, String actualTitle) {
		// TODO Auto-generated method stub
		
	}

	@And("user clicks on an item")
	public void user_clicks_on_an_item() {
	   
	}

	@And("user select the color")
	public void user_select_the_color() {
	    
	}

	@And("user selected size")
	public void user_selected_size() {
	    
	}

	@And("user clicks on add to bag button")
	public void user_clicks_on_add_to_bag_button() {
	    
	}

	@Then("user clicks on view bag")
	public void user_clicks_on_view_bag() {
	   
	}




}
