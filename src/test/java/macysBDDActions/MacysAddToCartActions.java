package macysBDDActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import macysBDDElements.AtefElements;
import macysBDDUtilities.SetupDriver;




public class MacysAddToCartActions {
AtefElements pageElement;
	
	public MacysAddToCartActions() {
		pageElement = new AtefElements();
		PageFactory.initElements(SetupDriver.driver, pageElement);
		
	}


	public void getMacysHomePage() {
		SetupDriver.driver.get("https://www.macys.com");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	public void getSearchBar() {
		System.out.println("Finding Search bar");
		pageElement.search.click();
		
	}
	
	public void inputSearch(String search) {
		System.out.println("Searching for a T-Shirt");
		pageElement.search.sendKeys(search);
	}
	
	public void clickSearchbtn() {
		System.out.println("Your wish is my command");
		pageElement.searchbtn.click();
	}
	
	public void clickItem() {
		System.out.println("You sure you want to BUY this?");
		pageElement.item.click();
	}
	
	public void pickColorAndSize() {
		System.out.println("Nice Color!!!!!");
		pageElement.color.click();
		pageElement.sizee.click();
	}
	
	public void addToBag() {
		System.out.println("Adding item to bag!");
		pageElement.addbtn.click();
	}
}




