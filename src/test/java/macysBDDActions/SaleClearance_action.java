package macysBDDActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import macysBDDElements.HomePageElements;
import macysBDDUtilities.SetupDriver;

public class SaleClearance_action {

	HomePageElements element;

	public SaleClearance_action() {
		element = new HomePageElements();
		PageFactory.initElements(SetupDriver.driver, element);
	}

	public void openMacysSignin() {
		SetupDriver.driver.get("https://www.macys.com");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		SetupDriver.driver.manage().deleteAllCookies();
		System.out.println("chrome opened ==>");
	}

	public void clickSales() {

		// Actions hover = new Actions(SetupDriver.driver);
		// hover.moveToElement(element.sales).perform();
		element.sales.click();

	}
	// public void expandsale(){
	// element.clearance.click();
	// }

	public void systemerror() {
		element.serviceerror.click();
		System.out.println("temporary error!!");

	}

	public void dropdown() {
		try {
			Select dropdown = new Select(element.dropdown);
			dropdown.selectByVisibleText("New Arrivals");
			element.dropdown.click();
			element.serviceerror.click();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("Temporary server error !!");
		}
	}
}
