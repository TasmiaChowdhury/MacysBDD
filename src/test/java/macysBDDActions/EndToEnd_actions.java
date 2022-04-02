package macysBDDActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import macysBDDElements.EndToEnd_elements;
import macysBDDUtilities.SetupDriver;

public class EndToEnd_actions {

	EndToEnd_elements elements;

	public EndToEnd_actions() {
		elements = new EndToEnd_elements();
		PageFactory.initElements(SetupDriver.driver, elements);

	}

	public void goToMacys() {
		SetupDriver.driver.get("https://www.macys.com");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SetupDriver.driver.manage().deleteAllCookies();
	}

	public void Click_men() {
		System.out.println("Clicking on Men");
		elements.Men.click();
		SetupDriver.driver.manage().deleteAllCookies();
	}

	public void Click_Shirt() {
		try{System.out.println("Clicking on Shirt");
		Actions hover = new Actions(SetupDriver.driver);
		elements.Shirt.isDisplayed();
		hover.moveToElement(elements.Shirt).click().build().perform();}
		
		catch (Exception e) {
			e.getStackTrace();
			System.out.println("Item not found, sold out");}
		
		//elements.Shirt.click();
		// SetupDriver.driver.manage().deleteAllCookies();
	}

	public void cookiesHandle() {
		elements.cookies.click();
	}

	public void Click_desired_shirt() {
		try {
			Actions hover = new Actions(SetupDriver.driver);
			elements.desired_Shirt.isDisplayed();
			hover.moveToElement(elements.desired_Shirt).click().build().perform();
			// elements.desired_Shirt.click();
			elements.serviceerror.click();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("Item not found, sold out");
		}
	}

	public void Click_color_black() {
		System.out.println("Clicking on black color");
		elements.color_black.click();

	}

	public void Click_size_S() {
		System.out.println("Clicking on size S");
		elements.size_S.click();
		// SetupDriver.driver.manage().deleteAllCookies();
	}

	public void Click_Add_To_Bag() {
		System.out.println("Clicking on Add to Bag");
		elements.Add_To_Bag.click();

	}

	public void Click_Checkout() {
		System.out.println("Clicking on Add to Bag");
		elements.Checkout.click();
		// SetupDriver.driver.manage().deleteAllCookies();

	}

}
