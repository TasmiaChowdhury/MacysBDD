package macysBDDStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.SaleClearance_action;
import macysBDDUtilities.Helper;

public class SalesClearanceStepDefination {

	SaleClearance_action action = new SaleClearance_action();

	@Given("user is on home page.")
	public void user_is_on_home_page() {
		action.openMacysSignin();

	}

	@When("user clicks on sales")
	public void user_clicks_on_sales() {
		action.clickSales();
		action.systemerror();

	}

	@And("user filter out the discount range")
	public void user_filter_out_the_discount_range() {
		action.dropdown();
		action.systemerror();

	}

	@Then("user is able to see the products based on desired discount")
	public void user_is_able_to_see_the_products_based_on_desired_discount() {
		
		String actualTitle = Helper.getPageTitle();
		String expectedTitle = "Macy's Sales,Discounts & Ads 2022-Macy's";
		assertEquals(expectedTitle,actualTitle);

	}

	private void assertEquals(String expectedTitle, String actualTitle) {
		
		
	}

}
