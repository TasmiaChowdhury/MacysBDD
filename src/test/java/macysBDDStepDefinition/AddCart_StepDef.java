package macysBDDStepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.AddCart_action;
import macysBDDActions.EndToEnd_Actions;
import macysBDDActions.Search_actions;
import macysBDDUtilities.Helper;

public class AddCart_StepDef {

	EndToEnd_Actions agent = new EndToEnd_Actions();
	Search_actions agent2 = new Search_actions();
	AddCart_action agent3 = new AddCart_action();

	@Given("User is on Macys selected product page")
	public void user_is_on_Macys_selected_product_page() {
		agent3.Macys();
		agent.cokies();
		// agent.Click_men();
	}

	@When("Click  color black")
	public void click_color_black() {
		agent.Click_color_black();
	}

	
	@When("Click  on size S")
	public void click_on_size_S() {
		agent.Click_size_S();

	}

	@When("Click  on Add To Bag")
	public void click_on_Add_To_Bag() {
		agent.Click_Add_To_Bag();
		agent.crosserror();
		//agent.Click_Add_To_Bag();
		//agent.cokies();
		System.out.println("Macy's technical issues msg keeps showing on page");

	}
	@Then ("Item adding confirmation page pops up")
	public void item_adding_confirmation_page_pops_up() throws InterruptedException {
		agent3.Handling_Alert();
	}

	@When("Click on View Bag")
	public void click_on_View_Bag() {
    agent3.alert_clickView();
	}

	@Then("User can find the product in the shopping bag")
	public void user_can_find_the_product_in_the_shopping_bag() {
		String actualTitle = Helper.getPageTitle();
		String expectedTitle = "Shopping Bag";
		assertEquals(expectedTitle,actualTitle);

	}

}
