package macysBDDActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import macysBDDElements.HomePageElements;
import macysBDDUtilities.SetupDriver;

public class HoursAndLocation_actions {

	HomePageElements element;

	public HoursAndLocation_actions() {
		element = new HomePageElements();
		PageFactory.initElements(SetupDriver.driver, element);

	}
	
	public void scrollingDown(){
		JavascriptExecutor js=(JavascriptExecutor)SetupDriver.driver;
		js.executeScript("window.scrollBy(0,14000)");
		//js.executeAsyncScript("arguments[0].scrollIntoView();", element.hoursAndLocation);
	}
	public void clickOnHoursLocations(){
		element.hoursAndLocation.click();
	}
}
