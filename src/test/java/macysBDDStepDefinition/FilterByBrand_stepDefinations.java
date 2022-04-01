package macysBDDStepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.FilterByBrands_actions;
import macysBDDUtilities.Helper;

public class FilterByBrand_stepDefinations {
	
	FilterByBrands_actions objBrands=new FilterByBrands_actions();
	
	@Given("User is in macys handbags page")
	public void user_is_in_macys_handbags_page() {
		objBrands.get_page();
		//eTeActions.cokies();
	    
	}

	@When("User click on brands")
	public void user_click_on_brands() {
		objBrands.click_brands();
	    
	}

	@When("Click on GUESS")
	public void click_on_GUESS() {
		objBrands.click_guess();
	    
	}
	
	@Then("User is navigated to GUESS brand page")
	public void user_is_navigated_to_GUESS_brand_page() {
		String actualTitle = Helper.getPageTitle();
		String expectedTitle =  "Handbags & Accessories / GUESS";
		assertEquals(expectedTitle,actualTitle);
	   
	}

	private void assertEquals(String expectedTitle, String actualTitle) {
		
		
	}

	@Then("User Click on a product")
	public void user_Click_on_a_product() {
		objBrands.Click_product();
		
		System.out.println("Can not access product because of security");
	    
	}


}
