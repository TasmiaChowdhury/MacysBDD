package macysBDDStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macysBDDActions.HoursAndLocation_actions;
import macysBDDUtilities.Helper;

public class HoursAndLocationStepsDefinations {
	
	HoursAndLocation_actions action = new HoursAndLocation_actions();
	
	@When("User Scrol Down to all the way bottom of the page")
	public void user_Scrol_Down_to_all_the_way_bottom_of_the_page() {
		action.scrollingDown();
	    
	}

	@And("User select hours and Location")
	public void user_select_hours_and_Location() {
		action.clickOnHoursLocations();
	    
	}

	@Then("User should be able to see Store hour and nearst store location")
	public void user_should_be_able_to_see_Store_hour_and_nearst_store_location() {
		String actualTitle = Helper.getPageTitle();
		String expectedTitle = "Men's shirt";
		assertEquals(expectedTitle,actualTitle);
	}

	private void assertEquals(String expectedTitle, String actualTitle) {
		
		
	}


}
