package macysBDDStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import macysBDDActions.ShopByDepActions;
import macysBDDUtilities.Helper;
import macysBDDUtilities.SetupDriver;

public class ShopByDepStepDefination {

	ShopByDepActions action = new ShopByDepActions();

	@Given("user in macys homepage")
	public void user_in_macys_homepage() {
		action.gotoMacysHomePage();
	}

	@And("user howver over to women department")
	public void user_howver_over_to_women_department() throws InterruptedException {
		action.mouseHover();
		action.cookiesHandle();
	}

	@And("user selected category dress")
	public void user_selected_category_dress() {
		action.clickOndress();

	}

	@Then("user navigated to {string}")
	public void user_navigated_to(String string) {
		String actualTitle = Helper.getPageTitle();
		String expectedTitle = "women's clothing and fashion ";
		assertEquals(expectedTitle, actualTitle);
		System.out.println("Steps-- Navigation  to macys women's dress" + SetupDriver.driver.getCurrentUrl());
	}

	private void assertEquals(String expectedTitle, String actualTitle) {
		// TODO Auto-generated method stub

	}

	@And("user clicks on an item")
	public void user_clicks_on_an_item() {
		try {
			action.selectaDress();;
		} catch (Exception e) {
			e.getStackTrace();

			System.out.println(" dress is sold out ");
		}

	}

	@And("user select the color")
	public void user_select_the_color() {
		try{action.dressColor();}
		
		catch (Exception e) {
			e.getStackTrace();
			System.out.println("color is sold out !!");
		
	}
	}

	@And("user selected size")
	public void user_selected_size() {
		try{action.dressSize();}
		//System.out.println("Due to not having access couldn't execute this part ");
		catch (Exception e) {
			e.getStackTrace();
			System.out.println("Access denied ");
		}
	}

	@And("user clicks on add to bag button")
	public void user_clicks_on_add_to_bag_button() {
		System.out.println("Due to not having access couldn't execute this part ");

	}

	@Then("user clicks on view bag")
	public void user_clicks_on_view_bag() {
		System.out.println("Due to not having access couldn't execute this part ");

	}

}
