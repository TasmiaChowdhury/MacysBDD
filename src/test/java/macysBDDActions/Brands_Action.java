package macysBDDActions;

import org.openqa.selenium.support.PageFactory;

import macysBDDElements.Elements_Rubyat;
import macysBDDUtilities.SetupDriver;

public class Brands_Action {
	Elements_Rubyat Ruby_elements;

	public Brands_Action() {
		Ruby_elements = new Elements_Rubyat();

		PageFactory.initElements(SetupDriver.driver, Ruby_elements);

	}

	public void get_page() {
		SetupDriver.driver.get("https://www.macys.com/shop/handbags-accessories?id=26846");
		SetupDriver.driver.manage().window().maximize();
		// SetupDriver.driver.manage().deleteAllCookies();

	}

	public void click_brands() {
		Ruby_elements.brand_expnd.click();
		// SetupDriver.driver.manage().deleteAllCookies();
	}

	public void click_guess() {

		Ruby_elements.Guess.click();
		// SetupDriver.driver.manage().deleteAllCookies();
	}

	public void Click_product() {
		Ruby_elements.product.click();
	}
	public void Click_color() {
		Ruby_elements.color.click();
	}
	public void Click_addBag() {
		Ruby_elements.add_Bag.click();
	}
	
	public void Click_Checkout() {
		Ruby_elements.checkout.click();
	}

}
