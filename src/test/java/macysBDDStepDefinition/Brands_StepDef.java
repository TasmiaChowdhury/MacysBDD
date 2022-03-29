package macysBDDStepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.Brands_Action;
import macysBDDActions.Search_actions;
import macysBDDUtilities.Helper;

public class Brands_StepDef {
	Brands_Action objBrands = new Brands_Action();
	

	@Given("User is in macys handbags page")
	public void user_is_in_macys_home_page() {
		objBrands.get_page();
	}

	@When("User click on brands")
	public void user_click_on_brands() {
		objBrands.click_brands();

	}

	@When("Click on GUESS")
	public void click_on_GUESS() {
		objBrands.click_guess();
		

	}
	@Then ("User is navigated to GUESS brand page")
	public void user_is_navigated_to_GUESS_brand_page() {
		Assert.assertEquals(Helper.getCurentUrl(), "https://www.macys.com/shop/handbags-accessories/guess?id=35848&edge=hybrid");
	System.out.println("Macy's is denied to give access to the page");
	}
	
	@When ("User Click on a product")
	public void user_Click_on_a_product() {
		objBrands.Click_product();
		System.out.println("Can not access product because of security");
	}
	
	@When("Click to select a color")
	public void click_to_select_a_color() {
		objBrands.Click_color();
		
	}
	@When("Click on Add to Bag")
	public void click_on_Add_to_Bag() {
		objBrands.Click_addBag();
	}
	
	@When ("Click on Checkout")
	public void click_on_Checkout(){
		objBrands.Click_Checkout();
	}
	
	@Then ("User is navigated to My Bag page")
	public void MyBag_Page() {
		Assert.assertEquals(Helper.getCurentUrl(), "https://www.macys.com/my-bag/");
		System.out.println("Macy's is denied to give access to the page");
	}
	}
